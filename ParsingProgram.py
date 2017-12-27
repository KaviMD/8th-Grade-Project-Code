# load JSON File for both
# Load lables file
# convert time from lables file into timestamp like json file
# Match files: for any timestamp in json file find range in lables file what lable in timerange
# write to combined file where eveyy line from json file have lable

# timestamp, gyro1, gyro2, gyro3, accel1, accel2, accel3, lable

# google "python pandas" write to csv

import json
import datetime
import time
from dateutil.parser import parse

accelData = []
gyroData = []
timestamps = []
stamps = []
activities = []
timestamps = []
Output = open('DataParsed.csv', 'w')
#offset = -(1000*60*60*4)
offset = 0

def findPos(array, item):

    pos = len(array)

    for ii in xrange(len(array)-1,0,-1):
        if (array[ii] <= item <= array[ii-1]) or (array[ii] >= item >= array[ii-1]):
            pos = ii
            break

    return pos

def parseTime(array):
	length = len(array)
	short = len(array)/2
	format = '%d-%m-%Y-%H-%M-%S-%f'
	data = [x for x in array if x]
	tm = [0]*short
	times = [0]*short
	activities = [0]*short
	#print array
	for i in range(0, length, 2):
		tm[i/2] = array[i].strip().split(':')
	#print tm
	for i in range(0, short):
		#string = tm[i][1][1:].split('-')
		string = tm[i][1][1:]
		#print string
		stamp = datetime.datetime.strptime(string, format)
		#print stamp.microsecond
		micro = stamp.microsecond
		#print time
		activities[i] = tm[i][0]
		#print stamp.hour
		#print stamp.minute
		#print stamp.second

		#print activities
		#dt = datetime.datetime(int(string[2]), int(string[1]), int(string[0]), int(string[3]), int(string[4]), int(string[5]), int(string[6]+'000'))
		#times[i] = time.mktime(dt.timetuple())
		#times[i] = time.mktime(stamp.timetuple())
		#times[i] = int(times[i]*1000+offset)
		#print times[i]
		times[i] = float(time.mktime(stamp.timetuple()))
		#print stamp.timetuple()
		#print times[i]
		#times[i] = times[i]+offset*1000+(micro)
		times[i] = times[i]*1000+(micro/1000)+offset
	#print times
	for i in range(0, short):
		activities[i] = activities[i].split()[0]
	return times[1:], activities[1:]

with open('Accelerometer.json', "rb") as fin: 
	data = json.load(fin)
	accelData = data['objects'][0]['rows']

with open('Gyroscope.json', "rb") as fin: 
	data = json.load(fin)
	gyroData = data['objects'][0]['rows']

with open('Timestamps.txt', "rb") as fin: 
	data = fin.readlines()
	timestamps = data
	#print timestamps

stamps, activities = parseTime(timestamps)
length = len(accelData)
lengthTwo = len(stamps)
#print accelData,gyroData
#print stamps, activities 
#print stamps
#print stamps[lengthTwo-1]
'''
print 'aware started'
print int(gyroData[0][1])
print 'video started'
print stamps[0]
print 'video stopped'
print stamps[lengthTwo-1]
print 'aware stopped'
print int(gyroData[length-1][1])
'''
'''
for i in range(0, length):
	tm = int(gyroData[i][1])
	#print tm
	#print stamps[0]
	if tm < stamps[0] or tm > stamps[lengthTwo-1]:
		#print "Other"
		Output.write(str(tm)+','+str(gyroData[i][3])+','+str(gyroData[i][3])+','+str(gyroData[i][3])+','+str(accelData[i][3])+','+str(accelData[i][3])+','+str(accelData[i][3])+', Other \n')
	else:
		pos = findPos(stamps, tm)
		#print pos
		#print activities[pos-1]
		Output.write(str(tm)+','+str(gyroData[i][3])+','+str(gyroData[i][3])+','+str(gyroData[i][3])+','+str(accelData[i][3])+','+str(accelData[i][3])+','+str(accelData[i][3])+','+str(activities[pos-1])+'\n')
'''

Output.write("timestamp,gyro1,gyro2,gyro3,accel1,accel2,accel3,label,labelnum,participantID\n")

labelNum = {'Still':0, 'Transition':1, 'Sitting':2, 'Standing':3, 'Walking':4, 'Running':5}

j = 0
k = 0
for i in range(0, len(stamps)-1):
	labelTime = stamps[i]
	nextLabelTime = stamps[i+1]
	label = activities[i]
	while j < length and float(accelData[j][1]) < labelTime:
		j=j+1
		if abs(gyroData[k][1] - accelData[j][1]) > abs(gyroData[k+1][1] - accelData[j][1]):
			k=k+1
	while j < length and float(accelData[j][1]) < nextLabelTime:
		if abs(gyroData[k][1] - accelData[j][1]) > abs(gyroData[k+1][1] - accelData[j][1]):
			k=k+1
		Output.write(str(accelData[j][1])+','+str(gyroData[k][3])+','+str(gyroData[k][4])+','+str(gyroData[k][5])+','+str(accelData[j][3])+','+str(accelData[j][4])+','+str(accelData[j][5])+','+str(label)+','+str(labelNum[label])+',5\n')
		j=j+1


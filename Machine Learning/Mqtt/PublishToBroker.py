'''
import paho.mqtt.client as mqtt #import the client1
#broker_address="127.0.0.1:5000" 
broker_address="m2m.eclipse.org"
print("creating new instance")
client = mqtt.Client("Phone") #create new instance
print("connecting to broker")
client.connect(broker_address, 1883, 60) #connect to broker
#print("Subscribing to topic","kavi/features")
#client.subscribe("kavi/features")
print("Publishing message to topic","kavi/features")
client.publish("kavi/features","Test")
'''
# Copyright (c) 2010-2013 Roger Light <roger@atchoo.org>
#
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Distribution License v1.0
# which accompanies this distribution.
#
# The Eclipse Distribution License is available at
#   http://www.eclipse.org/org/documents/edl-v10.php.
#
# Contributors:
#    Roger Light - initial implementation
# Copyright (c) 2010,2011 Roger Light <roger@atchoo.org>
# All rights reserved.

# This shows a simple example of an MQTT subscriber.

#import context  # Ensures paho is in PYTHONPATH
import paho.mqtt.client as mqtt


def on_connect(mqttc, obj, flags, rc):
    print("rc: " + str(rc))


def on_message(mqttc, obj, msg):
    print(msg.topic + " " + str(msg.qos) + " " + str(msg.payload))


def on_publish(mqttc, obj, mid):
    print("mid: " + str(mid))


def on_subscribe(mqttc, obj, mid, granted_qos):
    print("Subscribed: " + str(mid) + " " + str(granted_qos))


def on_log(mqttc, obj, level, string):
    print(string)


# If you want to use a specific client id, use
# mqttc = mqtt.Client("client-id")
# but note that the client id must be unique on the broker. Leaving the client
# id parameter empty will generate a random id for you.
mqttc = mqtt.Client("Phone")
mqttc.on_message = on_message
mqttc.on_connect = on_connect
mqttc.on_publish = on_publish
mqttc.on_subscribe = on_subscribe
# Uncomment to enable debug messages
#mqttc.on_log = on_log
mqttc.connect("m2m.eclipse.org", 1883, 60)
#0,63.0,-0.00359479071801,0.948509042163,12.0,0.33741032891,1.79820805475,49.0,0.270443624862,1.00511378583,1.82710989195e-14,-2.20912611484,2.63980132151,125.0,4.42264158007,1.58784140474,968.0,6.98956784369,1.76308431165,2732.0,0.345007083309,0.61692236752,0.583150881844,0.673711972532,0.475153717709,0.728035506077,0.321378462069,0.292492157282,0.613958809121,0.37494000878,0.339269541187,0.60023685097,0.777683118833,0.777683118833,0.378332287752,1
message = '-0.00359479071801,0.948509042163,12.0,0.33741032891,1.79820805475,49.0,0.270443624862,1.00511378583,1.82710989195e-14,-2.20912611484,2.63980132151,125.0,4.42264158007,1.58784140474,968.0,6.98956784369,1.76308431165,2732.0,0.345007083309,0.61692236752,0.583150881844,0.673711972532,0.475153717709,0.728035506077,0.321378462069,0.292492157282,0.613958809121,0.37494000878,0.339269541187,0.60023685097,0.777683118833,0.777683118833,0.378332287752'
message = "Test"
mqttc.publish("kavi/features/", message)

mqttc.loop_forever()

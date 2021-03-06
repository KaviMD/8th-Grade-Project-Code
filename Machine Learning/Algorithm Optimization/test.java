�T�
  class DecisionTreeClassifier {

    private static int findMax(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            index = nums[i] > nums[index] ? i : index;
        }
        return index;
    }

    public static int predict(double[] features) {
        int[] classes = new int[3];
            
        if (features[3] <= 0.800000011921) {
            classes[0] = 50; 
            classes[1] = 0; 
            classes[2] = 0; 
        } else {
            if (features[3] <= 1.75) {
                if (features[2] <= 4.94999980927) {
                    if (features[3] <= 1.65000009537) {
                        classes[0] = 0; 
                        classes[1] = 47; 
                        classes[2] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                    }
                } else {
                    if (features[3] <= 1.54999995232) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 3; 
                    } else {
                        if (features[2] <= 5.44999980927) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                        }
                    }
                }
            } else {
                if (features[2] <= 4.85000038147) {
                    if (features[1] <= 3.09999990463) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 2; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 43; 
                }
            }
        }
    
        return findMax(classes);
    }

    public static void main(String[] args) {
        if (args.length == 4) {

            // Features:
            double[] features = new double[args.length];
            for (int i = 0, l = args.length; i < l; i++) {
                features[i] = Double.parseDouble(args[i]);
            }

            // Prediction:
            int prediction = DecisionTreeClassifier.predict(features);
            System.out.println(prediction);

        }
    }
}q .
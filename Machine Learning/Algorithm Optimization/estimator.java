class RandomForestClassifier {
    public static int predict_0(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 697.563598633) {
            if (features[10] <= 2.98345327377) {
                if (features[26] <= 0.214529618621) {
                    classes[0] = 0; 
                    classes[1] = 3; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[28] <= 0.206078350544) {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[31] <= 0.768741607666) {
                            classes[0] = 786; 
                            classes[1] = 12; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[11] <= 737.290344238) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 14; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 2; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[22] <= 0.568343162537) {
                if (features[10] <= 3.49267625809) {
                    if (features[7] <= 0.329145312309) {
                        if (features[12] <= 7.22170066833) {
                            classes[0] = 59; 
                            classes[1] = 186; 
                            classes[2] = 47; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 175; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[0] <= 0.391797304153) {
                            classes[0] = 3; 
                            classes[1] = 4; 
                            classes[2] = 398; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        }
                    }
                } else {
                    if (features[1] <= 1.42631804943) {
                        if (features[5] <= 5364.24121094) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 35; 
                            classes[3] = 10; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 12; 
                        }
                    } else {
                        if (features[3] <= 0.800088047981) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 286; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 24; 
                        }
                    }
                }
            } else {
                if (features[10] <= 1.49144530296) {
                    if (features[8] <= 2.89015436172) {
                        if (features[5] <= 0.00339913601056) {
                            classes[0] = 5; 
                            classes[1] = 43; 
                            classes[2] = 10; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 331; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[30] <= 0.374762505293) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[4] <= 1.95777237415) {
                        if (features[13] <= 5.31662845612) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 15; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 5; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 51; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_1(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.357850253582) {
            if (features[15] <= -2.96521878242) {
                if (features[12] <= -6.98444223404) {
                    classes[0] = 0; 
                    classes[1] = 1; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 569; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[12] <= -5.74782276154) {
                    if (features[16] <= 0.0450934693217) {
                        if (features[30] <= 0.505077600479) {
                            classes[0] = 0; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 18; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[3] <= -0.00503816315904) {
                            classes[0] = 6; 
                            classes[1] = 458; 
                            classes[2] = 11; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 43; 
                            classes[2] = 37; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[17] <= 539.892333984) {
                        if (features[14] <= 2198.33178711) {
                            classes[0] = 31; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 213; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[6] <= 0.0189320743084) {
                            classes[0] = 220; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[8] <= -42.7917709351) {
                if (features[1] <= 1.27198600769) {
                    if (features[2] <= 165.323638916) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 12; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 1; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 102; 
                }
            } else {
                if (features[4] <= 1.75736641884) {
                    if (features[7] <= 1.59528112411) {
                        if (features[16] <= 0.834698140621) {
                            classes[0] = 6; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 1; 
                            classes[2] = 433; 
                            classes[3] = 14; 
                        }
                    } else {
                        if (features[5] <= 5567.140625) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 19; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[10] <= 3.4738240242) {
                        if (features[5] <= -127.254837036) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 23; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[12] <= 9.62338447571) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 243; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 10; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_2(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.358377933502) {
            if (features[12] <= -6.16733026505) {
                if (features[0] <= -0.027433399111) {
                    if (features[6] <= -0.00949033349752) {
                        if (features[20] <= 0.450442612171) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 19; 
                            classes[2] = 1; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[4] <= 0.410589009523) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 48; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[14] <= 6491.35839844) {
                        if (features[9] <= -0.817358613014) {
                            classes[0] = 2; 
                            classes[1] = 49; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 477; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[7] <= 0.018066784367) {
                            classes[0] = 9; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 12; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[11] <= 1000.49761963) {
                    if (features[12] <= 6.7429599762) {
                        if (features[26] <= 0.257667303085) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 437; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 205; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[30] <= 0.882793068886) {
                        if (features[32] <= 0.783069968224) {
                            classes[0] = 379; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 28; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[2] <= -82.079574585) {
                if (features[7] <= 1.09145832062) {
                    if (features[12] <= -10.0161952972) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 12; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 6; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 85; 
                }
            } else {
                if (features[13] <= 5.87906265259) {
                    if (features[16] <= 0.856382489204) {
                        if (features[13] <= 1.84431743622) {
                            classes[0] = 1; 
                            classes[1] = 11; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[32] <= 0.701319217682) {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 456; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 8; 
                            classes[1] = 1; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[10] <= 3.35756492615) {
                        if (features[16] <= 5.8457570076) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 285; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_3(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.357850253582) {
            if (features[11] <= 1560.55480957) {
                if (features[14] <= 592.93182373) {
                    if (features[26] <= 0.232373476028) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 3; 
                    } else {
                        if (features[12] <= -6.31343364716) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 413; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[8] <= 0.026243172586) {
                        if (features[13] <= 0.0337997749448) {
                            classes[0] = 2; 
                            classes[1] = 96; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 79; 
                            classes[2] = 59; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[5] <= -43.648765564) {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 28; 
                            classes[1] = 572; 
                            classes[2] = 1; 
                            classes[3] = 1; 
                        }
                    }
                }
            } else {
                if (features[30] <= 0.685361742973) {
                    if (features[16] <= 0.677554011345) {
                        classes[0] = 333; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[6] <= -0.120049029589) {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 26; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[12] <= -6.11934709549) {
                        classes[0] = 0; 
                        classes[1] = 10; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[13] <= 0.0590688660741) {
                            classes[0] = 4; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 15; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[19] <= 0.161406517029) {
                if (features[10] <= 3.29644870758) {
                    if (features[20] <= 0.69552564621) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 23; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[12] <= 9.44534492493) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 166; 
                    } else {
                        if (features[30] <= 0.530313849449) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                }
            } else {
                if (features[16] <= 4.56062078476) {
                    if (features[23] <= 0.147629648447) {
                        if (features[16] <= 2.42257809639) {
                            classes[0] = 1; 
                            classes[1] = 3; 
                            classes[2] = 11; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 18; 
                        }
                    } else {
                        if (features[14] <= 3641.8671875) {
                            classes[0] = 9; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 397; 
                            classes[3] = 17; 
                        }
                    }
                } else {
                    if (features[13] <= 5.925157547) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 5; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 220; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_4(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 749.916320801) {
            if (features[12] <= -5.80651378632) {
                if (features[13] <= 1.8469350338) {
                    classes[0] = 0; 
                    classes[1] = 15; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[32] <= 0.337943196297) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 8; 
                    }
                }
            } else {
                if (features[13] <= 3.58285617828) {
                    if (features[11] <= 1.38118326664) {
                        if (features[19] <= 0.460371017456) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 267.697662354) {
                            classes[0] = 655; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 118; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[30] <= 0.826087355614) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 8; 
                    } else {
                        classes[0] = 1; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[7] <= 0.33351457119) {
                if (features[0] <= -0.0308883227408) {
                    if (features[15] <= 0.531185030937) {
                        if (features[1] <= 0.0576648414135) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 53; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 34; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[31] <= 0.670153260231) {
                            classes[0] = 24; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[19] <= 0.981419563293) {
                        if (features[9] <= 5.14229869843) {
                            classes[0] = 22; 
                            classes[1] = 691; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 20; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 3; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[8] <= -21.3749465942) {
                    if (features[9] <= 2.56410932541) {
                        if (features[13] <= 5.6213183403) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 131; 
                        }
                    } else {
                        if (features[13] <= 6.08475971222) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 13; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 12; 
                        }
                    }
                } else {
                    if (features[4] <= 1.93391060829) {
                        if (features[13] <= 5.70870304108) {
                            classes[0] = 2; 
                            classes[1] = 9; 
                            classes[2] = 408; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 59; 
                        }
                    } else {
                        if (features[7] <= 0.665847718716) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 10; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 5; 
                            classes[3] = 225; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_5(double[] features) {
        int[] classes = new int[4];
        
        if (features[4] <= 0.671931862831) {
            if (features[9] <= 0.152202814817) {
                if (features[15] <= 3.10242938995) {
                    if (features[0] <= 0.0167694948614) {
                        if (features[0] <= -0.379108726978) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 12; 
                            classes[3] = 7; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 570; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[15] <= -6.29924917221) {
                            classes[0] = 29; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 22; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    classes[0] = 166; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[12] <= -6.27850389481) {
                    if (features[8] <= 0.0225671082735) {
                        if (features[4] <= 0.205881923437) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 54; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[16] <= 1.70558619499) {
                            classes[0] = 0; 
                            classes[1] = 142; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 13; 
                        }
                    }
                } else {
                    if (features[27] <= 0.646417975426) {
                        if (features[14] <= 5247.37597656) {
                            classes[0] = 572; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 27; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 0.0195022299886) {
                            classes[0] = 2; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 35; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[10] <= 3.90894412994) {
                if (features[16] <= 4.89906406403) {
                    if (features[13] <= 1.24531698227) {
                        if (features[13] <= 0.560672163963) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 2; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[10] <= 3.3947467804) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 401; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 44; 
                            classes[3] = 10; 
                        }
                    }
                } else {
                    if (features[26] <= 0.55674135685) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 15; 
                    } else {
                        if (features[12] <= -8.31047344208) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[1] <= 1.30709135532) {
                    if (features[7] <= 1.63058412075) {
                        if (features[13] <= 5.95244884491) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 27; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 6; 
                    }
                } else {
                    if (features[25] <= 0.637766242027) {
                        if (features[28] <= 0.649785041809) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 329; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 9; 
                        }
                    } else {
                        if (features[12] <= -0.182139873505) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_6(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.532843470573) {
            if (features[12] <= -6.3851647377) {
                if (features[0] <= -0.0274843033403) {
                    if (features[6] <= -0.0129931122065) {
                        if (features[10] <= 2.93184661865) {
                            classes[0] = 0; 
                            classes[1] = 18; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[16] <= 0.324894934893) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 57; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[12] <= -10.1607456207) {
                        if (features[17] <= 112.474838257) {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 18; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 544; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[16] <= 0.0351979658008) {
                    if (features[17] <= 55.0448455811) {
                        classes[0] = 0; 
                        classes[1] = 7; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[17] <= 325.318664551) {
                            classes[0] = 26; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 431; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[17] <= 110.616592407) {
                        if (features[14] <= 5396.58398438) {
                            classes[0] = 6; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 168; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[4] <= 1.0665307045) {
                            classes[0] = 417; 
                            classes[1] = 28; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[14] <= 5460.19921875) {
                if (features[15] <= -0.337853193283) {
                    if (features[32] <= 0.67067694664) {
                        if (features[7] <= 0.675764262676) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 181; 
                        }
                    } else {
                        if (features[11] <= 1071.94177246) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[13] <= 6.04551458359) {
                        if (features[25] <= 0.313807934523) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 30; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 33; 
                    }
                }
            } else {
                if (features[19] <= 0.110149070621) {
                    if (features[13] <= 5.620241642) {
                        if (features[24] <= 0.558627188206) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 52; 
                    }
                } else {
                    if (features[6] <= -0.29322257638) {
                        if (features[13] <= 4.68488407135) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 25; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 43; 
                        }
                    } else {
                        if (features[7] <= 1.10880017281) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 305; 
                            classes[3] = 14; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 46; 
                            classes[3] = 65; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_7(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.381610810757) {
            if (features[15] <= -2.73807859421) {
                if (features[15] <= -3.91480493546) {
                    classes[0] = 534; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[5] <= 0.298895120621) {
                        if (features[7] <= 0.296553075314) {
                            classes[0] = 17; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[7] <= 0.00512422248721) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[2] <= 0.0486873090267) {
                    if (features[30] <= 0.547250509262) {
                        if (features[11] <= 499.538330078) {
                            classes[0] = 9; 
                            classes[1] = 288; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 46; 
                            classes[1] = 17; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[5] <= -6.46400165558) {
                            classes[0] = 3; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 358; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[14] <= 4545.21240234) {
                        if (features[5] <= 11.9653377533) {
                            classes[0] = 209; 
                            classes[1] = 12; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[3] <= -0.0227871909738) {
                            classes[0] = 1; 
                            classes[1] = 85; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 38; 
                            classes[2] = 64; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[4] <= 1.75442433357) {
                if (features[14] <= 4321.00683594) {
                    if (features[1] <= 0.70099490881) {
                        classes[0] = 11; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[7] <= 1.51858234406) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 11; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 8; 
                        }
                    }
                } else {
                    if (features[22] <= 0.503033518791) {
                        if (features[25] <= 0.482279270887) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 154; 
                            classes[3] = 16; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 202; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[14] <= 6705.02441406) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 42; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 13; 
                        }
                    }
                }
            } else {
                if (features[13] <= 6.63573455811) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 25; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 352; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_8(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 1029.62744141) {
            if (features[4] <= 0.70883834362) {
                if (features[6] <= -1.29897880554) {
                    if (features[16] <= 2.22895336151) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 16; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 13; 
                    }
                } else {
                    if (features[17] <= 55.1922912598) {
                        if (features[0] <= -0.0342529304326) {
                            classes[0] = 2; 
                            classes[1] = 9; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 505; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[11] <= 4138.82763672) {
                            classes[0] = 28; 
                            classes[1] = 193; 
                            classes[2] = 54; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 52; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[12] <= -9.87561130524) {
                    if (features[4] <= 2.27249670029) {
                        if (features[14] <= 4924.28857422) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 245; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[10] <= 3.7887775898) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 9; 
                        }
                    }
                } else {
                    if (features[20] <= 0.397776842117) {
                        if (features[4] <= 1.60767817497) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 56; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 14; 
                        }
                    } else {
                        if (features[13] <= 6.35976219177) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 141; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 311; 
                        }
                    }
                }
            }
        } else {
            if (features[0] <= -0.201365575194) {
                if (features[21] <= 0.675785779953) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 26; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 2; 
                    classes[3] = 0; 
                }
            } else {
                if (features[3] <= -6.4106388092) {
                    classes[0] = 0; 
                    classes[1] = 10; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[4] <= 1.16254377365) {
                        if (features[26] <= 0.732798933983) {
                            classes[0] = 792; 
                            classes[1] = 19; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[32] <= 0.387666702271) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 10; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_9(double[] features) {
        int[] classes = new int[4];
        
        if (features[4] <= 0.668085992336) {
            if (features[31] <= 0.500898838043) {
                if (features[9] <= 0.101568304002) {
                    if (features[6] <= 0.036926779896) {
                        if (features[17] <= 1967.04052734) {
                            classes[0] = 13; 
                            classes[1] = 51; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 106; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 147; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[17] <= 539.310424805) {
                        if (features[14] <= 4523.30273438) {
                            classes[0] = 35; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 48; 
                            classes[2] = 10; 
                            classes[3] = 12; 
                        }
                    } else {
                        if (features[22] <= 0.306335508823) {
                            classes[0] = 4; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 435; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[12] <= -5.98844909668) {
                    if (features[15] <= -1.07581841946) {
                        if (features[14] <= 6420.96679688) {
                            classes[0] = 0; 
                            classes[1] = 35; 
                            classes[2] = 2; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 36; 
                            classes[2] = 53; 
                            classes[3] = 7; 
                        }
                    } else {
                        if (features[14] <= 6486.33886719) {
                            classes[0] = 0; 
                            classes[1] = 281; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[14] <= 4659.71484375) {
                        if (features[8] <= 0.00863813888282) {
                            classes[0] = 41; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 208; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[19] <= 0.137630581856) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 148; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[16] <= 4.0109500885) {
                if (features[13] <= 5.9412560463) {
                    if (features[10] <= 1.32819342613) {
                        if (features[13] <= 0.413221120834) {
                            classes[0] = 0; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 1.12923169136) {
                            classes[0] = 2; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 435; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 37; 
                }
            } else {
                if (features[12] <= -10.0176153183) {
                    if (features[13] <= 5.95776844025) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 17; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 5; 
                    }
                } else {
                    if (features[13] <= 6.64844083786) {
                        if (features[26] <= 0.502955853939) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 319; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_10(double[] features) {
        int[] classes = new int[4];
        
        if (features[9] <= 4.63562583923) {
            if (features[7] <= 0.358197033405) {
                if (features[31] <= 0.455134630203) {
                    if (features[16] <= 0.0387139618397) {
                        if (features[14] <= 4925.97753906) {
                            classes[0] = 188; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[32] <= 0.572101533413) {
                            classes[0] = 75; 
                            classes[1] = 64; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 23; 
                            classes[1] = 109; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[15] <= -9.86791133881) {
                        classes[0] = 109; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[14] <= 1020.73162842) {
                            classes[0] = 94; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 556; 
                            classes[2] = 62; 
                            classes[3] = 4; 
                        }
                    }
                }
            } else {
                if (features[14] <= 5460.56054688) {
                    if (features[13] <= 5.53070068359) {
                        if (features[15] <= 2.17249584198) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 198; 
                    }
                } else {
                    if (features[13] <= 5.94364929199) {
                        if (features[4] <= 0.0874091088772) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 438; 
                            classes[3] = 1; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 181; 
                    }
                }
            }
        } else {
            if (features[1] <= 0.720773100853) {
                if (features[24] <= 0.29915329814) {
                    if (features[9] <= 5.36942481995) {
                        classes[0] = 0; 
                        classes[1] = 3; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 2; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[10] <= 0.149143740535) {
                        classes[0] = 257; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[12] <= -6.16733026505) {
                            classes[0] = 0; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 106; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 29; 
                classes[3] = 0; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_11(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 1.32693433762) {
            if (features[4] <= 0.011982453987) {
                if (features[14] <= 5266.51464844) {
                    if (features[12] <= -6.36972618103) {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 471; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[2] <= 0.0718411430717) {
                        if (features[19] <= 0.981419563293) {
                            classes[0] = 0; 
                            classes[1] = 77; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[4] <= 0.00663182418793) {
                            classes[0] = 2; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[30] <= 0.451209127903) {
                    if (features[15] <= -3.07689595222) {
                        classes[0] = 142; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[6] <= 0.0202944017947) {
                            classes[0] = 72; 
                            classes[1] = 50; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 13; 
                            classes[1] = 86; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[0] <= -0.0308883227408) {
                        if (features[8] <= 0.021712616086) {
                            classes[0] = 13; 
                            classes[1] = 1; 
                            classes[2] = 48; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 16; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 556.817260742) {
                            classes[0] = 10; 
                            classes[1] = 470; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 149; 
                            classes[1] = 17; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[16] <= 4.01945972443) {
                if (features[1] <= 1.84180045128) {
                    if (features[9] <= 7.22339200974) {
                        if (features[5] <= 5293.94824219) {
                            classes[0] = 6; 
                            classes[1] = 4; 
                            classes[2] = 439; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 12; 
                            classes[3] = 20; 
                        }
                    } else {
                        classes[0] = 13; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[9] <= -0.83759534359) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 5; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 24; 
                    }
                }
            } else {
                if (features[16] <= 4.18339157104) {
                    if (features[24] <= 0.448553204536) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 12; 
                    } else {
                        if (features[30] <= 0.447268307209) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 11; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    }
                } else {
                    if (features[10] <= 3.47481393814) {
                        if (features[15] <= -1.94305610657) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[16] <= 4.89506340027) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 51; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 281; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_12(double[] features) {
        int[] classes = new int[4];
        
        if (features[5] <= 5.25548648834) {
            if (features[17] <= 552.499267578) {
                if (features[4] <= 0.70883834362) {
                    if (features[11] <= 3437.51757812) {
                        if (features[32] <= 0.546733736992) {
                            classes[0] = 19; 
                            classes[1] = 261; 
                            classes[2] = 63; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 13; 
                            classes[1] = 472; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 38; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[16] <= 3.54889154434) {
                        if (features[1] <= 0.385055541992) {
                            classes[0] = 2; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 131; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[10] <= 3.47283697128) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 12; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 102; 
                        }
                    }
                }
            } else {
                if (features[16] <= 3.46856570244) {
                    if (features[16] <= 2.80759382248) {
                        if (features[12] <= 8.34012126923) {
                            classes[0] = 733; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 13; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[26] <= 0.498557448387) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[19] <= 0.848360300064) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 38; 
                    } else {
                        if (features[23] <= 0.79756462574) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                }
            }
        } else {
            if (features[16] <= 4.06095933914) {
                if (features[7] <= 0.354559779167) {
                    if (features[0] <= 3.8076646328) {
                        if (features[15] <= -2.20943498611) {
                            classes[0] = 15; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 8; 
                            classes[1] = 49; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 23; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[5] <= 100.567871094) {
                        if (features[1] <= 1.95842456818) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 230; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 8; 
                        }
                    } else {
                        if (features[24] <= 0.414909511805) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 4; 
                            classes[3] = 19; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 37; 
                            classes[3] = 12; 
                        }
                    }
                }
            } else {
                if (features[7] <= 0.847231864929) {
                    if (features[6] <= 0.0335951671004) {
                        if (features[0] <= -0.055586297065) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[26] <= 0.557861685753) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 8; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 206; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_13(double[] features) {
        int[] classes = new int[4];
        
        if (features[16] <= 1.66183042526) {
            if (features[9] <= 0.151613771915) {
                if (features[9] <= -2.81036996841) {
                    classes[0] = 88; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[13] <= 0.41386193037) {
                        if (features[8] <= 0.0947295874357) {
                            classes[0] = 103; 
                            classes[1] = 169; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 438; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[15] <= 4.21376609802) {
                            classes[0] = 5; 
                            classes[1] = 4; 
                            classes[2] = 9; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[14] <= 3758.28027344) {
                    if (features[30] <= 0.685361742973) {
                        if (features[11] <= 1.69746923447) {
                            classes[0] = 9; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 570; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 3057.59399414) {
                            classes[0] = 1; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 17; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[6] <= -0.0982331484556) {
                        classes[0] = 0; 
                        classes[1] = 141; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[14] <= 5807.78076172) {
                            classes[0] = 3; 
                            classes[1] = 30; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 15; 
                            classes[1] = 12; 
                            classes[2] = 91; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[16] <= 4.18172454834) {
                if (features[19] <= 0.110412031412) {
                    if (features[26] <= 0.543848514557) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 30; 
                    } else {
                        if (features[25] <= 0.44457089901) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[4] <= 0.671443462372) {
                        if (features[6] <= -0.131405472755) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 17; 
                            classes[3] = 16; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[28] <= 0.240536719561) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 387; 
                            classes[3] = 9; 
                        }
                    }
                }
            } else {
                if (features[13] <= 5.86056995392) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 13; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 321; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_14(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.381592869759) {
            if (features[12] <= -6.19554758072) {
                if (features[9] <= 1.15809059143) {
                    if (features[14] <= 6483.02636719) {
                        if (features[13] <= 1.17621588707) {
                            classes[0] = 1; 
                            classes[1] = 425; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[3] <= -0.0294087976217) {
                            classes[0] = 1; 
                            classes[1] = 15; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 14; 
                            classes[1] = 4; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[10] <= 0.0876977145672) {
                        if (features[15] <= -1.04802370071) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 57; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 16; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 0.054677259177) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 108; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[16] <= 0.0351979658008) {
                    if (features[15] <= -2.5356259346) {
                        classes[0] = 350; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[2] <= 0.0542261786759) {
                            classes[0] = 32; 
                            classes[1] = 13; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 80; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[3] <= -0.0229528695345) {
                        if (features[12] <= 5.92810058594) {
                            classes[0] = 189; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 19; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 4.0872964859) {
                            classes[0] = 69; 
                            classes[1] = 187; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 85; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[7] <= 0.963510036469) {
                if (features[13] <= 6.29409980774) {
                    if (features[14] <= 3603.06762695) {
                        classes[0] = 16; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[32] <= 0.237415671349) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 352; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 28; 
                }
            } else {
                if (features[1] <= 1.42488384247) {
                    if (features[23] <= 0.150131136179) {
                        if (features[8] <= 205.404815674) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 9; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 11; 
                        }
                    } else {
                        if (features[20] <= 0.685104727745) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 70; 
                            classes[3] = 8; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[10] <= 3.37832069397) {
                        if (features[8] <= 79.6395111084) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 12; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[13] <= 4.77120828629) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 354; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_15(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 734.917419434) {
            if (features[8] <= -5.1354470253) {
                if (features[16] <= 2.61331343651) {
                    if (features[27] <= 0.477311491966) {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 2; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 14; 
                }
            } else {
                if (features[1] <= 0.956963658333) {
                    if (features[3] <= -6.41360855103) {
                        classes[0] = 0; 
                        classes[1] = 6; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[26] <= 0.232373476028) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 786; 
                            classes[1] = 19; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[1] <= 1.23919093609) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 6; 
                    }
                }
            }
        } else {
            if (features[13] <= 1.29982984066) {
                if (features[11] <= 2931.95703125) {
                    if (features[14] <= 4675.74902344) {
                        if (features[15] <= -2.20943498611) {
                            classes[0] = 11; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 1.34519934654) {
                            classes[0] = 19; 
                            classes[1] = 617; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 14; 
                            classes[1] = 144; 
                            classes[2] = 59; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 15; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[22] <= 0.450421065092) {
                    if (features[7] <= 0.948788285255) {
                        if (features[15] <= -3.2459435463) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 251; 
                            classes[3] = 5; 
                        }
                    } else {
                        if (features[16] <= 4.24991321564) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 41; 
                            classes[3] = 7; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 71; 
                        }
                    }
                } else {
                    if (features[1] <= 1.71839749813) {
                        if (features[13] <= 5.83143520355) {
                            classes[0] = 4; 
                            classes[1] = 2; 
                            classes[2] = 153; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 47; 
                        }
                    } else {
                        if (features[7] <= 0.733158707619) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 232; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_16(double[] features) {
        int[] classes = new int[4];
        
        if (features[16] <= 1.40354561806) {
            if (features[17] <= 542.767456055) {
                if (features[13] <= 0.0128607228398) {
                    if (features[22] <= 0.632304549217) {
                        if (features[6] <= -0.0761983692646) {
                            classes[0] = 15; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[5] <= 0.0893014073372) {
                        if (features[6] <= 0.00693125138059) {
                            classes[0] = 25; 
                            classes[1] = 223; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 17; 
                            classes[1] = 26; 
                            classes[2] = 53; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[10] <= 1.41938495636) {
                            classes[0] = 15; 
                            classes[1] = 487; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[3] <= -6.44967556) {
                    classes[0] = 0; 
                    classes[1] = 3; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[4] <= 0.0458426065743) {
                        if (features[21] <= 0.673314809799) {
                            classes[0] = 593; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 22; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 0.124813988805) {
                            classes[0] = 15; 
                            classes[1] = 12; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 123; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[10] <= 3.49267625809) {
                if (features[11] <= 2833.78417969) {
                    if (features[10] <= 0.931642949581) {
                        classes[0] = 0; 
                        classes[1] = 5; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[1] <= 0.481204628944) {
                            classes[0] = 7; 
                            classes[1] = 3; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 418; 
                            classes[3] = 4; 
                        }
                    }
                } else {
                    classes[0] = 16; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[11] <= 1676.7355957) {
                    if (features[7] <= 1.74585604668) {
                        if (features[28] <= 0.604344248772) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 201; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 29; 
                            classes[3] = 17; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 173; 
                    }
                } else {
                    if (features[7] <= 1.79236340523) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 19; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 6; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_17(double[] features) {
        int[] classes = new int[4];
        
        if (features[9] <= 4.60654830933) {
            if (features[13] <= 1.27661895752) {
                if (features[4] <= 0.0113526135683) {
                    if (features[14] <= 4921.92382812) {
                        if (features[6] <= -0.503380477428) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 239; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[15] <= -1.03693163395) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 63; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[15] <= -6.73365926743) {
                        classes[0] = 154; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[2] <= 0.0533665269613) {
                            classes[0] = 30; 
                            classes[1] = 532; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 82; 
                            classes[1] = 141; 
                            classes[2] = 60; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[13] <= 5.70870304108) {
                    if (features[29] <= 0.715969324112) {
                        if (features[7] <= 0.315382659435) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 1; 
                            classes[2] = 413; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[0] <= 0.0492198765278) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 417; 
                }
            }
        } else {
            if (features[10] <= 2.30341553688) {
                if (features[31] <= 0.84833574295) {
                    if (features[20] <= 0.252635329962) {
                        if (features[16] <= 0.349751740694) {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[30] <= 0.715960979462) {
                            classes[0] = 353; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[11] <= 1587.47631836) {
                        classes[0] = 0; 
                        classes[1] = 11; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 1; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 24; 
                classes[3] = 0; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_18(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 1.38004362583) {
            if (features[17] <= 542.767456055) {
                if (features[2] <= 0.0564826503396) {
                    if (features[1] <= 0.00428382586688) {
                        if (features[4] <= 0.00422785803676) {
                            classes[0] = 9; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 2972.11401367) {
                            classes[0] = 12; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 16; 
                            classes[1] = 620; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[4] <= 0.0277647208422) {
                        if (features[8] <= 0.104464568198) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 55; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 12; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[15] <= -6.37764501572) {
                            classes[0] = 7; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 124; 
                            classes[2] = 16; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[3] <= -6.4106388092) {
                    classes[0] = 0; 
                    classes[1] = 8; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[12] <= -6.15949726105) {
                        classes[0] = 0; 
                        classes[1] = 18; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[30] <= 0.787521243095) {
                            classes[0] = 771; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 17; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[13] <= 5.42212295532) {
                if (features[31] <= 0.172933101654) {
                    classes[0] = 3; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[7] <= 0.226085454226) {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[32] <= 0.69580078125) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 447; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[6] <= 0.332368254662) {
                    if (features[12] <= -10.0176153183) {
                        if (features[32] <= 0.622634410858) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 10; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 348; 
                    }
                } else {
                    if (features[9] <= -0.952916026115) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 22; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_19(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.530741810799) {
            if (features[11] <= 1398.55932617) {
                if (features[11] <= 45.5200958252) {
                    if (features[15] <= -3.1050992012) {
                        classes[0] = 101; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[12] <= -9.85317993164) {
                            classes[0] = 6; 
                            classes[1] = 382; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 35; 
                            classes[1] = 82; 
                            classes[2] = 2; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    if (features[12] <= -5.51777505875) {
                        if (features[8] <= 0.0231672301888) {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 63; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 160; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[26] <= 0.406477451324) {
                            classes[0] = 40; 
                            classes[1] = 44; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 296; 
                            classes[1] = 83; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[8] <= 1.53119373322) {
                    if (features[31] <= 0.931246876717) {
                        if (features[5] <= 0.121244549751) {
                            classes[0] = 249; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 101; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[11] <= 2394.06689453) {
                        if (features[17] <= 1043.78759766) {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[7] <= 0.060833632946) {
                            classes[0] = 22; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 8; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[8] <= -16.0573120117) {
                if (features[16] <= 3.20343470573) {
                    if (features[17] <= -49.9872322083) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 3; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 21; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[10] <= 2.63918328285) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 141; 
                    }
                }
            } else {
                if (features[12] <= -9.87000656128) {
                    if (features[19] <= 0.599578857422) {
                        if (features[10] <= 3.5342066288) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 76; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 16; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 149; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[7] <= 0.968615651131) {
                        if (features[12] <= 8.4891834259) {
                            classes[0] = 4; 
                            classes[1] = 4; 
                            classes[2] = 36; 
                            classes[3] = 23; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 106; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 1.42392325401) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 53; 
                            classes[3] = 15; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 193; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_20(double[] features) {
        int[] classes = new int[4];
        
        if (features[12] <= -5.54223918915) {
            if (features[32] <= 0.610795021057) {
                if (features[13] <= 5.89318132401) {
                    if (features[19] <= 0.646417856216) {
                        if (features[4] <= 0.999771237373) {
                            classes[0] = 2; 
                            classes[1] = 156; 
                            classes[2] = 49; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 67; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 0.491308033466) {
                            classes[0] = 7; 
                            classes[1] = 27; 
                            classes[2] = 26; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 168; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 170; 
                }
            } else {
                if (features[14] <= 6513.28320312) {
                    if (features[8] <= 3.41841220856) {
                        if (features[1] <= 2.32413315773) {
                            classes[0] = 2; 
                            classes[1] = 345; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[12] <= -9.57599830627) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 5; 
                        }
                    }
                } else {
                    if (features[10] <= 3.06959056854) {
                        if (features[1] <= 0.577495038509) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 14; 
                    }
                }
            }
        } else {
            if (features[14] <= 1725.52600098) {
                if (features[12] <= 7.24199485779) {
                    if (features[4] <= 2.05394411087) {
                        if (features[18] <= 0.784921109676) {
                            classes[0] = 826; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 24; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 2; 
                    }
                } else {
                    if (features[10] <= 2.13283157349) {
                        if (features[18] <= 0.307652890682) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 13; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 26; 
                    }
                }
            } else {
                if (features[4] <= 0.682464718819) {
                    if (features[32] <= 0.797447800636) {
                        if (features[2] <= -12.2011108398) {
                            classes[0] = 6; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 21; 
                            classes[1] = 220; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 5864.3984375) {
                            classes[0] = 3; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[1] <= 1.41242957115) {
                        if (features[10] <= 4.00702857971) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 158; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 8; 
                        }
                    } else {
                        if (features[29] <= 0.675765097141) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 186; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_21(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.379305243492) {
            if (features[16] <= 0.0383306220174) {
                if (features[14] <= 5266.51464844) {
                    classes[0] = 486; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[13] <= 0.0281885564327) {
                        if (features[8] <= 0.210410535336) {
                            classes[0] = 0; 
                            classes[1] = 17; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 8; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[11] <= 1315.34985352) {
                    if (features[30] <= 0.307491481304) {
                        if (features[14] <= 5323.07324219) {
                            classes[0] = 47; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 31; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[19] <= 0.0641270205379) {
                            classes[0] = 12; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 130; 
                            classes[1] = 647; 
                            classes[2] = 56; 
                            classes[3] = 9; 
                        }
                    }
                } else {
                    if (features[12] <= -6.08669281006) {
                        classes[0] = 0; 
                        classes[1] = 27; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[12] <= 7.33132600784) {
                            classes[0] = 183; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[16] <= 3.8759739399) {
                if (features[7] <= 1.16510772705) {
                    if (features[17] <= 1922.29956055) {
                        if (features[16] <= 0.940964758396) {
                            classes[0] = 3; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 379; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[4] <= 1.10299742222) {
                            classes[0] = 12; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[12] <= 9.42434310913) {
                        if (features[21] <= 0.573398351669) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 8; 
                            classes[3] = 59; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 1; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 42; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[13] <= 5.95776844025) {
                    if (features[24] <= 0.19092670083) {
                        classes[0] = 4; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 27; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 354; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_22(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 763.684570312) {
            if (features[16] <= 2.76465415955) {
                if (features[8] <= 1.66303873062) {
                    if (features[2] <= 12.1466407776) {
                        if (features[14] <= -374.536499023) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 743; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[15] <= -3.53489637375) {
                        classes[0] = 21; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[3] <= -0.0169242098927) {
                            classes[0] = 0; 
                            classes[1] = 17; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[32] <= 0.328556776047) {
                    if (features[32] <= 0.310169577599) {
                        if (features[22] <= 0.514419794083) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 2; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 18; 
                }
            }
        } else {
            if (features[1] <= 0.503498733044) {
                if (features[0] <= -0.0307307578623) {
                    if (features[13] <= 0.0819838494062) {
                        if (features[8] <= 0.0729906111956) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 67; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[16] <= 0.189726650715) {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 31; 
                            classes[2] = 3; 
                            classes[3] = 3; 
                        }
                    }
                } else {
                    if (features[10] <= 0.0195069126785) {
                        if (features[12] <= 7.21044254303) {
                            classes[0] = 10; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 596.452758789) {
                            classes[0] = 26; 
                            classes[1] = 758; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[11] <= 259.533203125) {
                    if (features[10] <= 3.46940326691) {
                        if (features[32] <= 0.70806825161) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 357; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 5.36303901672) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 18; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 229; 
                        }
                    }
                } else {
                    if (features[16] <= 3.10522031784) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 42; 
                        classes[3] = 0; 
                    } else {
                        if (features[4] <= 1.62902808189) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 11; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 145; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_23(double[] features) {
        int[] classes = new int[4];
        
        if (features[5] <= 5.25548648834) {
            if (features[7] <= 0.381592869759) {
                if (features[4] <= 0.00919229350984) {
                    if (features[1] <= 0.00489512970671) {
                        if (features[30] <= 0.158392190933) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 259; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 574.660522461) {
                            classes[0] = 0; 
                            classes[1] = 17; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 53; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[2] <= 0.0437584854662) {
                        if (features[19] <= 0.228551030159) {
                            classes[0] = 107; 
                            classes[1] = 43; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 131; 
                            classes[1] = 556; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 1329.13696289) {
                            classes[0] = 21; 
                            classes[1] = 123; 
                            classes[2] = 63; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 185; 
                            classes[1] = 13; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[10] <= 3.46318697929) {
                    if (features[15] <= -3.42149448395) {
                        classes[0] = 14; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[31] <= 0.130628570914) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 167; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[4] <= 1.75220060349) {
                        if (features[15] <= -1.37188708782) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 11; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 10; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[25] <= 0.526801049709) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 95; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 33; 
                        }
                    }
                }
            }
        } else {
            if (features[10] <= 3.76577377319) {
                if (features[13] <= 1.23947906494) {
                    if (features[23] <= 0.525396466255) {
                        if (features[26] <= 0.550747454166) {
                            classes[0] = 5; 
                            classes[1] = 41; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[8] <= 3.57475852966) {
                            classes[0] = 9; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 15; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 4.8642168045) {
                        if (features[23] <= 0.10230666399) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 7; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 258; 
                            classes[3] = 7; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 10; 
                    }
                }
            } else {
                if (features[1] <= 1.42631804943) {
                    if (features[9] <= 2.03422117233) {
                        if (features[8] <= 360.14944458) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 17; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[16] <= 5.30065822601) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 18; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 235; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_24(double[] features) {
        int[] classes = new int[4];
        
        if (features[4] <= 0.657121419907) {
            if (features[17] <= 545.727783203) {
                if (features[8] <= 2.91801214218) {
                    if (features[3] <= -0.0294087976217) {
                        if (features[9] <= -2.70039820671) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 431; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[2] <= 0.0558249019086) {
                            classes[0] = 40; 
                            classes[1] = 226; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 28; 
                            classes[2] = 67; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[4] <= 0.22948436439) {
                        if (features[13] <= 1.39151084423) {
                            classes[0] = 16; 
                            classes[1] = 16; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 15; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[13] <= 3.8282186985) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 24; 
                        }
                    }
                }
            } else {
                if (features[23] <= 0.0592863336205) {
                    if (features[25] <= 0.713114976883) {
                        classes[0] = 0; 
                        classes[1] = 5; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 2; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[2] <= -4.02624225616) {
                        if (features[30] <= 0.815678358078) {
                            classes[0] = 1; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 5508.94140625) {
                            classes[0] = 752; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[19] <= 0.180380523205) {
                if (features[4] <= 1.51064562798) {
                    if (features[9] <= 4.3810710907) {
                        if (features[8] <= -58.8949203491) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 29; 
                            classes[3] = 1; 
                        }
                    } else {
                        classes[0] = 3; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[10] <= 3.39438223839) {
                        if (features[32] <= 0.397885143757) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[10] <= 4.13684844971) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 9; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 149; 
                        }
                    }
                }
            } else {
                if (features[15] <= -0.401722371578) {
                    if (features[9] <= -0.00820395536721) {
                        if (features[11] <= 252.951568604) {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 160; 
                            classes[3] = 34; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 18; 
                        }
                    } else {
                        if (features[25] <= 0.57657957077) {
                            classes[0] = 5; 
                            classes[1] = 5; 
                            classes[2] = 69; 
                            classes[3] = 150; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 34; 
                            classes[3] = 6; 
                        }
                    }
                } else {
                    if (features[13] <= 1.01749873161) {
                        classes[0] = 0; 
                        classes[1] = 6; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[27] <= 0.481845796108) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 12; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 181; 
                            classes[3] = 1; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_25(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 1.36087274551) {
            if (features[27] <= 0.454485476017) {
                if (features[11] <= 98.7979202271) {
                    if (features[14] <= 5159.03320312) {
                        if (features[9] <= -1.9414741993) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 41; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= -0.80757278204) {
                            classes[0] = 5; 
                            classes[1] = 16; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 279; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[15] <= -2.92861223221) {
                        classes[0] = 132; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[7] <= 0.00844723917544) {
                            classes[0] = 22; 
                            classes[1] = 11; 
                            classes[2] = 11; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 18; 
                            classes[1] = 81; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[4] <= 0.0153903067112) {
                    if (features[31] <= 0.580965995789) {
                        if (features[32] <= 0.649481415749) {
                            classes[0] = 323; 
                            classes[1] = 6; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 39; 
                            classes[1] = 26; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 389.755981445) {
                            classes[0] = 0; 
                            classes[1] = 27; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 24; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[11] <= 1341.46875) {
                        if (features[5] <= 26.3599014282) {
                            classes[0] = 127; 
                            classes[1] = 329; 
                            classes[2] = 28; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 18; 
                            classes[1] = 5; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[30] <= 0.72647947073) {
                            classes[0] = 83; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 15; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[7] <= 0.981678128242) {
                if (features[32] <= 0.20555241406) {
                    classes[0] = 8; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[18] <= 0.642901659012) {
                        if (features[13] <= 6.86355304718) {
                            classes[0] = 7; 
                            classes[1] = 1; 
                            classes[2] = 382; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 13; 
                        }
                    } else {
                        if (features[9] <= -0.885726332664) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 18; 
                        }
                    }
                }
            } else {
                if (features[12] <= 9.44534492493) {
                    if (features[20] <= 0.644284367561) {
                        if (features[1] <= 1.42488384247) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 24; 
                            classes[3] = 32; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 285; 
                        }
                    } else {
                        if (features[19] <= 0.620596408844) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 7; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 3.38332414627) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 58; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 15; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_26(double[] features) {
        int[] classes = new int[4];
        
        if (features[10] <= 1.34102582932) {
            if (features[15] <= -2.92487859726) {
                if (features[12] <= -6.48748397827) {
                    classes[0] = 0; 
                    classes[1] = 4; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[16] <= 2.47009372711) {
                        classes[0] = 531; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 1; 
                    }
                }
            } else {
                if (features[12] <= -5.63670158386) {
                    if (features[15] <= -1.07626962662) {
                        if (features[8] <= 0.0243844129145) {
                            classes[0] = 0; 
                            classes[1] = 11; 
                            classes[2] = 54; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 97; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[6] <= 0.0274362415075) {
                            classes[0] = 1; 
                            classes[1] = 104; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 356; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[12] <= 7.21893119812) {
                        classes[0] = 282; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[4] <= 0.709764957428) {
                            classes[0] = 0; 
                            classes[1] = 223; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[13] <= 5.70870304108) {
                if (features[4] <= 0.70745909214) {
                    if (features[17] <= 507.651000977) {
                        if (features[15] <= -1.43869674206) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 25; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 10; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 33; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[16] <= 1.04437279701) {
                        classes[0] = 2; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[1] <= 0.464159607887) {
                            classes[0] = 3; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 1; 
                            classes[2] = 420; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[22] <= 0.336798995733) {
                    if (features[24] <= 0.556281805038) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 3; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 376; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_27(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 1669.06860352) {
            if (features[10] <= 1.29073655605) {
                if (features[10] <= 0.0236205887049) {
                    if (features[6] <= -0.075854152441) {
                        classes[0] = 59; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 5; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[9] <= 4.9574508667) {
                        if (features[15] <= -0.961419224739) {
                            classes[0] = 18; 
                            classes[1] = 141; 
                            classes[2] = 67; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 546; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[31] <= 0.699338078499) {
                            classes[0] = 42; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[13] <= 5.94364929199) {
                    if (features[13] <= 1.24531698227) {
                        if (features[22] <= 0.37223482132) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 3641.8671875) {
                            classes[0] = 7; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 426; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 393; 
                }
            }
        } else {
            if (features[6] <= -0.156279161572) {
                if (features[27] <= 0.529286384583) {
                    if (features[15] <= -1.43600320816) {
                        if (features[17] <= 2956.47460938) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 0.497802257538) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[12] <= -6.5326499939) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 1; 
                    } else {
                        classes[0] = 25; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[12] <= 5.04228830338) {
                    if (features[1] <= 1.19282233715) {
                        if (features[27] <= 0.14232775569) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 765; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 3; 
                    }
                } else {
                    if (features[6] <= 0.0967424586415) {
                        classes[0] = 0; 
                        classes[1] = 7; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 1; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_28(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.565174996853) {
            if (features[11] <= 1457.57543945) {
                if (features[17] <= 660.710693359) {
                    if (features[5] <= 0.141472414136) {
                        if (features[0] <= -0.030451990664) {
                            classes[0] = 3; 
                            classes[1] = 12; 
                            classes[2] = 61; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 20; 
                            classes[1] = 243; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 0.383993327618) {
                            classes[0] = 17; 
                            classes[1] = 481; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[18] <= 0.919625043869) {
                        if (features[9] <= 2.52245306969) {
                            classes[0] = 454; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 6; 
                    }
                }
            } else {
                if (features[31] <= 0.668771624565) {
                    if (features[16] <= 0.140926122665) {
                        classes[0] = 293; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[18] <= 0.69119656086) {
                            classes[0] = 64; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 11; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[4] <= 0.162995040417) {
                        if (features[1] <= 0.00969973392785) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 19; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 9; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[1] <= 1.81816792488) {
                if (features[4] <= 2.04894399643) {
                    if (features[0] <= 0.461993485689) {
                        if (features[31] <= 0.149056866765) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 2; 
                            classes[2] = 399; 
                            classes[3] = 13; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 18; 
                    }
                } else {
                    if (features[1] <= 0.983342766762) {
                        if (features[23] <= 0.260961771011) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[18] <= 0.585022926331) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 38; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 14; 
                        }
                    }
                }
            } else {
                if (features[13] <= 6.08321666718) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 14; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 316; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_29(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.481204628944) {
            if (features[32] <= 0.672104716301) {
                if (features[14] <= 4202.59472656) {
                    if (features[3] <= -3.56678342819) {
                        if (features[29] <= 0.627306103706) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[4] <= 0.0677910521626) {
                            classes[0] = 595; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 72; 
                            classes[1] = 16; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[10] <= 0.182791292667) {
                        if (features[32] <= 0.537629365921) {
                            classes[0] = 9; 
                            classes[1] = 136; 
                            classes[2] = 64; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 137; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[5] <= 46.9541854858) {
                            classes[0] = 2; 
                            classes[1] = 170; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 3; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[14] <= 4629.59765625) {
                    if (features[22] <= 0.306784063578) {
                        if (features[23] <= 0.494771391153) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= 8.30660247803) {
                            classes[0] = 114; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[2] <= 18.7913093567) {
                        if (features[19] <= 0.0396441854537) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 290; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 8; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[7] <= 0.972985863686) {
                if (features[16] <= 5.23332548141) {
                    if (features[0] <= 0.251571834087) {
                        if (features[13] <= 1.02945697308) {
                            classes[0] = 1; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 3; 
                            classes[2] = 371; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[24] <= 0.553954601288) {
                            classes[0] = 7; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 35; 
                }
            } else {
                if (features[1] <= 1.3825545311) {
                    if (features[16] <= 4.59237480164) {
                        if (features[13] <= 5.29169368744) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 98; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 12; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 9; 
                    }
                } else {
                    if (features[7] <= 1.02488350868) {
                        if (features[31] <= 0.390326738358) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 11; 
                        }
                    } else {
                        if (features[21] <= 0.736223220825) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 323; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_30(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.507479906082) {
            if (features[14] <= 3717.69580078) {
                if (features[26] <= 0.399326205254) {
                    if (features[5] <= 11.8472309113) {
                        if (features[12] <= 8.42725753784) {
                            classes[0] = 66; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 4.12766075134) {
                            classes[0] = 1; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[4] <= 0.072702512145) {
                        if (features[23] <= 0.979834198952) {
                            classes[0] = 658; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[1] <= 0.0303823947906) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 111; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[3] <= -0.046586483717) {
                    if (features[19] <= 0.977052807808) {
                        if (features[25] <= 0.265840440989) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 430; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 2; 
                    }
                } else {
                    if (features[32] <= 0.53617477417) {
                        if (features[11] <= 97.4098892212) {
                            classes[0] = 9; 
                            classes[1] = 76; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 51; 
                            classes[2] = 65; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[5] <= 38.0602645874) {
                            classes[0] = 13; 
                            classes[1] = 146; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 8; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[13] <= 5.925157547) {
                if (features[17] <= 2903.37695312) {
                    if (features[15] <= 1.21820688248) {
                        if (features[25] <= 0.725711882114) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 468; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[29] <= 0.449345052242) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[6] <= -0.111462235451) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 6; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[7] <= 0.757527470589) {
                    if (features[4] <= 1.95446538925) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 5; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 387; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_31(double[] features) {
        int[] classes = new int[4];
        
        if (features[15] <= -3.98888254166) {
            if (features[16] <= 4.7838177681) {
                if (features[27] <= 0.14232775569) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 1; 
                } else {
                    classes[0] = 584; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[23] <= 0.51306527853) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 1; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[16] <= 1.18193650246) {
                if (features[14] <= 4202.59472656) {
                    if (features[16] <= 0.190513372421) {
                        if (features[12] <= -5.6958770752) {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 232; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= -5.93916416168) {
                            classes[0] = 0; 
                            classes[1] = 17; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 27; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[9] <= 1.25937390327) {
                        if (features[14] <= 6487.04541016) {
                            classes[0] = 1; 
                            classes[1] = 553; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 18; 
                            classes[1] = 14; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 1.52260780334) {
                            classes[0] = 0; 
                            classes[1] = 15; 
                            classes[2] = 64; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 14; 
                            classes[1] = 120; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[12] <= -9.87561130524) {
                    if (features[8] <= 31.516002655) {
                        if (features[4] <= 2.24384117126) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 246; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 8; 
                        }
                    } else {
                        if (features[16] <= 2.31488728523) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 15; 
                        }
                    }
                } else {
                    if (features[4] <= 1.75736641884) {
                        if (features[10] <= 4.27089691162) {
                            classes[0] = 7; 
                            classes[1] = 13; 
                            classes[2] = 173; 
                            classes[3] = 12; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 26; 
                        }
                    } else {
                        if (features[22] <= 0.366766482592) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 343; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_32(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 1535.30126953) {
            if (features[5] <= 5.25548648834) {
                if (features[13] <= 1.27661895752) {
                    if (features[9] <= 6.77551460266) {
                        if (features[32] <= 0.5360044837) {
                            classes[0] = 6; 
                            classes[1] = 216; 
                            classes[2] = 65; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 492; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 55; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[1] <= 1.63242793083) {
                        if (features[7] <= 1.79237294197) {
                            classes[0] = 5; 
                            classes[1] = 4; 
                            classes[2] = 158; 
                            classes[3] = 10; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 10; 
                        }
                    } else {
                        if (features[7] <= 0.683583021164) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 130; 
                        }
                    }
                }
            } else {
                if (features[7] <= 0.972353458405) {
                    if (features[1] <= 0.474969089031) {
                        if (features[13] <= 4.96165800095) {
                            classes[0] = 11; 
                            classes[1] = 27; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 7; 
                        }
                    } else {
                        if (features[3] <= -1.4793022871) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 2; 
                            classes[3] = 7; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 194; 
                            classes[3] = 9; 
                        }
                    }
                } else {
                    if (features[13] <= 5.34105014801) {
                        if (features[7] <= 3.07745456696) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 63; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 236; 
                    }
                }
            }
        } else {
            if (features[12] <= -6.30285453796) {
                if (features[0] <= -0.020912444219) {
                    if (features[15] <= -0.635413527489) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 17; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 3; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[13] <= 4.16503620148) {
                        classes[0] = 0; 
                        classes[1] = 18; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 2; 
                    }
                }
            } else {
                if (features[7] <= 0.849575221539) {
                    if (features[2] <= -0.0500328317285) {
                        if (features[17] <= 6764.171875) {
                            classes[0] = 7; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= 5.93279838562) {
                            classes[0] = 775; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 4; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_33(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 1785.2109375) {
            if (features[8] <= 1.82678186893) {
                if (features[2] <= -0.325334012508) {
                    if (features[19] <= 0.123500823975) {
                        if (features[16] <= 3.0925412178) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 56; 
                        }
                    } else {
                        if (features[5] <= -93.0249633789) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 13; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 6; 
                            classes[2] = 126; 
                            classes[3] = 41; 
                        }
                    }
                } else {
                    if (features[10] <= 1.37442433834) {
                        if (features[16] <= 0.0315124616027) {
                            classes[0] = 50; 
                            classes[1] = 9; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 41; 
                            classes[1] = 713; 
                            classes[2] = 55; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[25] <= 0.584577322006) {
                            classes[0] = 8; 
                            classes[1] = 5; 
                            classes[2] = 73; 
                            classes[3] = 81; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 36; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[13] <= 5.95776844025) {
                    if (features[1] <= 0.383993327618) {
                        if (features[7] <= 0.0549528375268) {
                            classes[0] = 17; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 27; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[24] <= 0.14863973856) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 241; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 182; 
                }
            }
        } else {
            if (features[7] <= 0.782777667046) {
                if (features[29] <= 0.710118889809) {
                    if (features[27] <= 0.143544644117) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 2; 
                    } else {
                        if (features[11] <= 1.38118326664) {
                            classes[0] = 6; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 704; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[2] <= 3117.89013672) {
                        if (features[0] <= -0.00452805776149) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 8; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[13] <= 5.97461080551) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 8; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 9; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_34(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1729.83325195) {
            if (features[10] <= 2.98345327377) {
                if (features[29] <= 0.727470636368) {
                    if (features[2] <= 3173.1574707) {
                        if (features[30] <= 0.762364149094) {
                            classes[0] = 807; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[3] <= -6.42158031464) {
                        classes[0] = 0; 
                        classes[1] = 10; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 10; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[9] <= 4.04475688934) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 54; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 5; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[13] <= 1.30918955803) {
                if (features[0] <= -0.0274843033403) {
                    if (features[32] <= 0.530420064926) {
                        if (features[19] <= 0.345368504524) {
                            classes[0] = 0; 
                            classes[1] = 14; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 5; 
                            classes[2] = 61; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[6] <= 0.0490360595286) {
                            classes[0] = 0; 
                            classes[1] = 15; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[15] <= -4.40023422241) {
                        classes[0] = 15; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[4] <= 0.87241101265) {
                            classes[0] = 18; 
                            classes[1] = 664; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[10] <= 3.48949098587) {
                    if (features[10] <= 3.35535335541) {
                        if (features[21] <= 0.208761364222) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 431; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[2] <= 116.053619385) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 14; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    }
                } else {
                    if (features[31] <= 0.744284749031) {
                        if (features[16] <= 3.09125375748) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 30; 
                            classes[3] = 15; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 330; 
                        }
                    } else {
                        if (features[16] <= 3.63509273529) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_35(double[] features) {
        int[] classes = new int[4];
        
        if (features[15] <= -3.98888254166) {
            if (features[14] <= 6542.08691406) {
                if (features[30] <= 0.70449411869) {
                    classes[0] = 499; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[29] <= 0.327250957489) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 1; 
                    } else {
                        classes[0] = 16; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[20] <= 0.540793299675) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 2; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 1; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[17] <= 2029.91467285) {
                if (features[7] <= 0.335940718651) {
                    if (features[3] <= -0.0191373880953) {
                        if (features[15] <= 4.85232925415) {
                            classes[0] = 2; 
                            classes[1] = 487; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 6.77551460266) {
                            classes[0] = 16; 
                            classes[1] = 280; 
                            classes[2] = 47; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 61; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[7] <= 0.986108422279) {
                        if (features[0] <= 0.520708739758) {
                            classes[0] = 4; 
                            classes[1] = 11; 
                            classes[2] = 395; 
                            classes[3] = 19; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[1] <= 1.3825545311) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 75; 
                            classes[3] = 28; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 345; 
                        }
                    }
                }
            } else {
                if (features[15] <= 3.11682796478) {
                    if (features[0] <= -0.0786017999053) {
                        if (features[26] <= 0.529420256615) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[10] <= 2.68634033203) {
                            classes[0] = 0; 
                            classes[1] = 25; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 221; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_36(double[] features) {
        int[] classes = new int[4];
        
        if (features[4] <= 0.669906377792) {
            if (features[1] <= 0.00551419984549) {
                if (features[16] <= 0.0554948337376) {
                    if (features[17] <= 361.729400635) {
                        if (features[8] <= 0.174732774496) {
                            classes[0] = 0; 
                            classes[1] = 20; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 23; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 326; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[7] <= 0.00178510521073) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 6; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[11] <= 35.3687667847) {
                    if (features[7] <= 0.0617253705859) {
                        if (features[0] <= -0.0251941867173) {
                            classes[0] = 14; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 35; 
                            classes[1] = 402; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 4119.90332031) {
                            classes[0] = 23; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 27; 
                            classes[2] = 6; 
                            classes[3] = 6; 
                        }
                    }
                } else {
                    if (features[26] <= 0.406477451324) {
                        if (features[14] <= 229.384735107) {
                            classes[0] = 30; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 23; 
                            classes[1] = 111; 
                            classes[2] = 16; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 4660.90722656) {
                            classes[0] = 366; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 21; 
                            classes[1] = 185; 
                            classes[2] = 55; 
                            classes[3] = 5; 
                        }
                    }
                }
            }
        } else {
            if (features[22] <= 0.451179862022) {
                if (features[12] <= -10.0176153183) {
                    if (features[16] <= 5.24635219574) {
                        if (features[22] <= 0.372144818306) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 15; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 100; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 3; 
                    }
                } else {
                    if (features[1] <= 1.6184540987) {
                        if (features[14] <= 1006.88647461) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 142; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[6] <= 0.332368254662) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 90; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 2; 
                        }
                    }
                }
            } else {
                if (features[1] <= 1.70213317871) {
                    if (features[10] <= 3.96903753281) {
                        if (features[29] <= 0.712049603462) {
                            classes[0] = 7; 
                            classes[1] = 5; 
                            classes[2] = 145; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[25] <= 0.574080109596) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 36; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[10] <= 2.82955360413) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 8; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 261; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_37(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1729.83325195) {
            if (features[5] <= 13.3574008942) {
                if (features[15] <= -2.82092547417) {
                    classes[0] = 552; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[4] <= 1.06214022636) {
                        if (features[8] <= 4.73989200592) {
                            classes[0] = 313; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[15] <= 0.721809029579) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 20; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[4] <= 1.25753509998) {
                    if (features[27] <= 0.513641178608) {
                        if (features[19] <= 0.52253651619) {
                            classes[0] = 0; 
                            classes[1] = 12; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 17; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 27; 
                }
            }
        } else {
            if (features[15] <= -0.953262805939) {
                if (features[10] <= 3.49267625809) {
                    if (features[7] <= 0.364736914635) {
                        if (features[10] <= 0.0923134461045) {
                            classes[0] = 10; 
                            classes[1] = 15; 
                            classes[2] = 47; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 13; 
                            classes[1] = 129; 
                            classes[2] = 13; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[0] <= 0.544799029827) {
                            classes[0] = 2; 
                            classes[1] = 1; 
                            classes[2] = 280; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    }
                } else {
                    if (features[13] <= 4.95414161682) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 20; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 204; 
                    }
                }
            } else {
                if (features[32] <= 0.536358952522) {
                    if (features[26] <= 0.397423744202) {
                        if (features[1] <= 0.427807360888) {
                            classes[0] = 5; 
                            classes[1] = 18; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 93; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[16] <= 1.22048306465) {
                            classes[0] = 9; 
                            classes[1] = 122; 
                            classes[2] = 10; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 68; 
                            classes[3] = 30; 
                        }
                    }
                } else {
                    if (features[1] <= 0.536901533604) {
                        if (features[18] <= 0.734227657318) {
                            classes[0] = 2; 
                            classes[1] = 418; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 1.65989470482) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 18; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 55; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_38(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1729.83325195) {
            if (features[8] <= -5.1354470253) {
                if (features[16] <= 2.42484736443) {
                    if (features[2] <= -25.8827495575) {
                        classes[0] = 3; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 5; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 28; 
                }
            } else {
                if (features[7] <= 0.799415767193) {
                    if (features[14] <= -404.078125) {
                        classes[0] = 0; 
                        classes[1] = 3; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[22] <= 0.341171294451) {
                            classes[0] = 25; 
                            classes[1] = 16; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 789; 
                            classes[1] = 11; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[22] <= 0.37433218956) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 3; 
                        classes[3] = 0; 
                    } else {
                        if (features[11] <= -25.8396282196) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 19; 
                        }
                    }
                }
            }
        } else {
            if (features[7] <= 0.379305243492) {
                if (features[2] <= 0.0587798766792) {
                    if (features[9] <= 7.11320161819) {
                        if (features[14] <= 4660.90722656) {
                            classes[0] = 5; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 8; 
                            classes[1] = 601; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 9; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[9] <= 4.37317562103) {
                        if (features[7] <= 0.0153735522181) {
                            classes[0] = 2; 
                            classes[1] = 9; 
                            classes[2] = 57; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 8; 
                            classes[1] = 114; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[27] <= 0.390188246965) {
                            classes[0] = 2; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 14; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[14] <= 5429.78515625) {
                    if (features[27] <= 0.519574403763) {
                        if (features[26] <= 0.25903442502) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 149; 
                        }
                    } else {
                        if (features[13] <= 5.75334644318) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 22; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 34; 
                        }
                    }
                } else {
                    if (features[13] <= 5.70870304108) {
                        if (features[10] <= 0.773146033287) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 407; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[20] <= 0.650144636631) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 185; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 5; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_39(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.357850253582) {
            if (features[17] <= 548.205810547) {
                if (features[3] <= -0.0294087976217) {
                    if (features[14] <= 6797.62011719) {
                        if (features[11] <= 2728.60791016) {
                            classes[0] = 2; 
                            classes[1] = 454; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 2; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[20] <= 0.657044649124) {
                        if (features[6] <= 0.00499589927495) {
                            classes[0] = 45; 
                            classes[1] = 243; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 24; 
                            classes[1] = 28; 
                            classes[2] = 51; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[27] <= 0.573713541031) {
                            classes[0] = 2; 
                            classes[1] = 3; 
                            classes[2] = 25; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 10; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[12] <= -6.56326675415) {
                    if (features[13] <= 1.12500834465) {
                        classes[0] = 0; 
                        classes[1] = 23; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[21] <= 0.495463043451) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 8; 
                        }
                    }
                } else {
                    if (features[25] <= 0.144017219543) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 2; 
                    } else {
                        if (features[12] <= 8.34012126923) {
                            classes[0] = 762; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[16] <= 4.1519317627) {
                if (features[13] <= 5.40313529968) {
                    if (features[15] <= -4.16128873825) {
                        classes[0] = 6; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[14] <= 3603.06762695) {
                            classes[0] = 6; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 436; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 60; 
                }
            } else {
                if (features[9] <= -0.108703404665) {
                    if (features[19] <= 0.866330504417) {
                        if (features[1] <= 1.763412714) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 122; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 8; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 199; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_40(double[] features) {
        int[] classes = new int[4];
        
        if (features[10] <= 1.36454236507) {
            if (features[17] <= 549.005249023) {
                if (features[14] <= 4548.53173828) {
                    if (features[16] <= 0.0478378385305) {
                        classes[0] = 26; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[30] <= 0.594566464424) {
                            classes[0] = 10; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[13] <= 1.44082093239) {
                        if (features[15] <= -0.958174705505) {
                            classes[0] = 18; 
                            classes[1] = 154; 
                            classes[2] = 59; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 569; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 17; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[12] <= -6.16655158997) {
                    classes[0] = 0; 
                    classes[1] = 21; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[1] <= 0.122949331999) {
                        if (features[9] <= -2.53952598572) {
                            classes[0] = 85; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 659; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 3.84908771515) {
                            classes[0] = 6; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 31; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[13] <= 5.70870304108) {
                if (features[17] <= 1002.27233887) {
                    if (features[21] <= 0.219246953726) {
                        if (features[2] <= -18.273443222) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 1831.79211426) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 450; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[14] <= 886.260864258) {
                        if (features[2] <= -5.90333795547) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 32; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 5; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[22] <= 0.392052590847) {
                    if (features[10] <= 3.49739694595) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 16; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 362; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_41(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 602.271179199) {
            if (features[4] <= 1.14455592632) {
                if (features[3] <= -6.41360855103) {
                    classes[0] = 0; 
                    classes[1] = 4; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[16] <= 0.168074443936) {
                        if (features[14] <= 245.456268311) {
                            classes[0] = 560; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 110; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 2159.61767578) {
                            classes[0] = 17; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 93; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[28] <= 0.620476126671) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 15; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[8] <= -0.443442136049) {
                if (features[13] <= 5.9412560463) {
                    if (features[13] <= 0.8881316185) {
                        if (features[0] <= 0.00549778714776) {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 159; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 194; 
                }
            } else {
                if (features[13] <= 1.27661895752) {
                    if (features[14] <= 4145.15332031) {
                        if (features[12] <= -6.75939702988) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 40; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[0] <= -0.0335669182241) {
                            classes[0] = 4; 
                            classes[1] = 25; 
                            classes[2] = 60; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 29; 
                            classes[1] = 689; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 3.55569028854) {
                        if (features[10] <= 3.31012535095) {
                            classes[0] = 1; 
                            classes[1] = 1; 
                            classes[2] = 223; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 34; 
                            classes[3] = 23; 
                        }
                    } else {
                        if (features[13] <= 5.86056995392) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 26; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 202; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_42(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 1.32693433762) {
            if (features[12] <= -5.98844909668) {
                if (features[16] <= 0.0424995608628) {
                    if (features[9] <= 0.506544649601) {
                        classes[0] = 0; 
                        classes[1] = 6; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 11; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[14] <= 6502.97460938) {
                        if (features[5] <= 0.0135509371758) {
                            classes[0] = 1; 
                            classes[1] = 74; 
                            classes[2] = 25; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 472; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[8] <= 0.425617992878) {
                            classes[0] = 6; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[8] <= 0.00390645349398) {
                    if (features[14] <= 4953.234375) {
                        if (features[30] <= 0.68248128891) {
                            classes[0] = 53; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[6] <= -0.0791079998016) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 106; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[11] <= 17.6820526123) {
                        if (features[12] <= 5.215716362) {
                            classes[0] = 66; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 60; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 4945.90234375) {
                            classes[0] = 718; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 61; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[4] <= 1.79965341091) {
                if (features[10] <= 4.24079704285) {
                    if (features[15] <= -3.65998363495) {
                        if (features[15] <= -9.45862197876) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 5.94364929199) {
                            classes[0] = 4; 
                            classes[1] = 2; 
                            classes[2] = 423; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 16; 
                        }
                    }
                } else {
                    if (features[9] <= 2.54965853691) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 44; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 8; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[16] <= 3.47145318985) {
                    if (features[14] <= 5354.453125) {
                        if (features[25] <= 0.469945192337) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 8; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 14; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[13] <= 6.35976219177) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 5; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 330; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_43(double[] features) {
        int[] classes = new int[4];
        
        if (features[3] <= 0.110182441771) {
            if (features[17] <= 1029.62744141) {
                if (features[4] <= 0.689210653305) {
                    if (features[8] <= 1.35489523411) {
                        if (features[9] <= 4.52186775208) {
                            classes[0] = 25; 
                            classes[1] = 601; 
                            classes[2] = 64; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 31; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[10] <= 0.051330588758) {
                            classes[0] = 49; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 19; 
                            classes[1] = 94; 
                            classes[2] = 13; 
                            classes[3] = 15; 
                        }
                    }
                } else {
                    if (features[10] <= 3.95260739326) {
                        if (features[1] <= 1.93811953068) {
                            classes[0] = 1; 
                            classes[1] = 9; 
                            classes[2] = 251; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 16; 
                        }
                    } else {
                        if (features[9] <= 4.89038991928) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 178; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[13] <= 3.67255163193) {
                    if (features[12] <= -6.57169866562) {
                        if (features[15] <= 0.0565915107727) {
                            classes[0] = 0; 
                            classes[1] = 14; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[11] <= 1.30914711952) {
                            classes[0] = 4; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 758; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 24; 
                }
            }
        } else {
            if (features[14] <= 5636.04394531) {
                if (features[11] <= 1653.24365234) {
                    if (features[16] <= 3.20956850052) {
                        if (features[22] <= 0.45943915844) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[17] <= 1809.54003906) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 86; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 5; 
                        }
                    }
                } else {
                    if (features[10] <= 2.27739810944) {
                        classes[0] = 16; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[7] <= 1.89650917053) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 15; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    }
                }
            } else {
                if (features[16] <= 4.96249389648) {
                    if (features[4] <= 1.93999254704) {
                        if (features[13] <= 1.24531698227) {
                            classes[0] = 0; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 153; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[31] <= 0.450328052044) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 12; 
                        }
                    }
                } else {
                    if (features[26] <= 0.552648305893) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 41; 
                    } else {
                        if (features[21] <= 0.530675053596) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_44(double[] features) {
        int[] classes = new int[4];
        
        if (features[15] <= -2.95896720886) {
            if (features[13] <= 3.67255163193) {
                if (features[15] <= -3.91909456253) {
                    classes[0] = 546; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[1] <= 0.0718505829573) {
                        classes[0] = 21; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[30] <= 0.532426834106) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[14] <= 6553.52246094) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 14; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[10] <= 1.36454236507) {
                if (features[11] <= 1394.48693848) {
                    if (features[2] <= 0.0532096996903) {
                        if (features[14] <= 540.826904297) {
                            classes[0] = 17; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 18; 
                            classes[1] = 595; 
                            classes[2] = 13; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= -5.56667566299) {
                            classes[0] = 4; 
                            classes[1] = 109; 
                            classes[2] = 60; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 113; 
                            classes[1] = 29; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[17] <= 41.6010894775) {
                        classes[0] = 0; 
                        classes[1] = 18; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[31] <= 0.647619724274) {
                            classes[0] = 109; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 15; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[7] <= 0.968615651131) {
                    if (features[16] <= 5.17358255386) {
                        if (features[7] <= 0.317955374718) {
                            classes[0] = 3; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 1; 
                            classes[2] = 352; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 25; 
                    }
                } else {
                    if (features[4] <= 1.75345575809) {
                        if (features[13] <= 5.95776844025) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 97; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 43; 
                        }
                    } else {
                        if (features[13] <= 5.047706604) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 324; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_45(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.34374126792) {
            if (features[16] <= 0.0385244376957) {
                if (features[29] <= 0.306796848774) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                } else {
                    if (features[12] <= 8.23740291595) {
                        if (features[14] <= 6106.484375) {
                            classes[0] = 523; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 2; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 18; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[0] <= 0.0630342066288) {
                    if (features[13] <= 0.0368067361414) {
                        if (features[9] <= 1.15655136108) {
                            classes[0] = 3; 
                            classes[1] = 296; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 7; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= -6.3851647377) {
                            classes[0] = 9; 
                            classes[1] = 287; 
                            classes[2] = 50; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 203; 
                            classes[1] = 106; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[12] <= -6.54342937469) {
                        classes[0] = 0; 
                        classes[1] = 36; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 147; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[7] <= 1.03676998615) {
                if (features[32] <= 0.693651616573) {
                    if (features[1] <= 1.89271318913) {
                        if (features[8] <= 102.124572754) {
                            classes[0] = 4; 
                            classes[1] = 6; 
                            classes[2] = 330; 
                            classes[3] = 7; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 1; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[13] <= 6.43285799026) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 24; 
                        }
                    }
                } else {
                    if (features[31] <= 0.0500424057245) {
                        classes[0] = 0; 
                        classes[1] = 3; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[14] <= 4566.05664062) {
                            classes[0] = 14; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[1] <= 1.41685652733) {
                    if (features[19] <= 0.50582742691) {
                        if (features[28] <= 0.76293951273) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 72; 
                            classes[3] = 14; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[15] <= -0.45108371973) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 14; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[10] <= 2.47839808464) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 3; 
                        classes[3] = 0; 
                    } else {
                        if (features[29] <= 0.426196217537) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 44; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 286; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_46(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.530741810799) {
            if (features[15] <= -2.95187973976) {
                classes[0] = 595; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                if (features[10] <= 0.0236895792186) {
                    if (features[24] <= 0.624775409698) {
                        if (features[14] <= 3543.40087891) {
                            classes[0] = 43; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 3; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[11] <= 1396.44836426) {
                        if (features[2] <= 0.0486873090267) {
                            classes[0] = 37; 
                            classes[1] = 604; 
                            classes[2] = 4; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 116; 
                            classes[1] = 138; 
                            classes[2] = 66; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[12] <= -5.86444950104) {
                            classes[0] = 0; 
                            classes[1] = 21; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 97; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[1] <= 1.70754265785) {
                if (features[4] <= 2.04894399643) {
                    if (features[24] <= 0.414994239807) {
                        if (features[7] <= 1.15258049965) {
                            classes[0] = 1; 
                            classes[1] = 2; 
                            classes[2] = 19; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 9; 
                        }
                    } else {
                        if (features[7] <= 1.86812758446) {
                            classes[0] = 4; 
                            classes[1] = 2; 
                            classes[2] = 404; 
                            classes[3] = 11; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        }
                    }
                } else {
                    if (features[12] <= -9.70185661316) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 6; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 33; 
                    }
                }
            } else {
                if (features[13] <= 6.35976219177) {
                    if (features[6] <= 0.0302225649357) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 16; 
                        classes[3] = 0; 
                    } else {
                        if (features[20] <= 0.430231332779) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 310; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_47(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.36450317502) {
            if (features[17] <= 542.767456055) {
                if (features[11] <= 2825.02197266) {
                    if (features[2] <= 0.0564826503396) {
                        if (features[1] <= 0.543579936028) {
                            classes[0] = 16; 
                            classes[1] = 589; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[7] <= 0.0151292253286) {
                            classes[0] = 2; 
                            classes[1] = 4; 
                            classes[2] = 64; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 13; 
                            classes[1] = 124; 
                            classes[2] = 12; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 39; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[6] <= -0.156536102295) {
                    if (features[24] <= 0.641271829605) {
                        if (features[0] <= 0.0410309396684) {
                            classes[0] = 2; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 17; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[5] <= 371.863128662) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[28] <= 0.1767911762) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 1; 
                    } else {
                        if (features[2] <= -0.0522925965488) {
                            classes[0] = 19; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 734; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[16] <= 4.02572917938) {
                if (features[19] <= 0.0913019105792) {
                    if (features[13] <= 5.47320842743) {
                        if (features[25] <= 0.697451651096) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 26; 
                    }
                } else {
                    if (features[14] <= 3603.06762695) {
                        if (features[1] <= 1.03743290901) {
                            classes[0] = 25; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[0] <= 0.501733720303) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 434; 
                            classes[3] = 11; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 16; 
                        }
                    }
                }
            } else {
                if (features[28] <= 0.544540047646) {
                    if (features[12] <= -9.88561630249) {
                        if (features[10] <= 3.77284812927) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 10; 
                        }
                    } else {
                        if (features[22] <= 0.336798995733) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 259; 
                        }
                    }
                } else {
                    if (features[13] <= 6.80648803711) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 21; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 71; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_48(double[] features) {
        int[] classes = new int[4];
        
        if (features[4] <= 0.657121419907) {
            if (features[12] <= -8.44528484344) {
                if (features[15] <= -0.320214986801) {
                    if (features[10] <= 0.0923134461045) {
                        if (features[0] <= -0.0220477450639) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 53; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 0.534024178982) {
                            classes[0] = 8; 
                            classes[1] = 106; 
                            classes[2] = 14; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 11; 
                            classes[3] = 14; 
                        }
                    }
                } else {
                    if (features[20] <= 0.429053872824) {
                        if (features[30] <= 0.498379230499) {
                            classes[0] = 0; 
                            classes[1] = 23; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 71; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 337; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[11] <= 775.912597656) {
                    if (features[11] <= 411.261779785) {
                        if (features[8] <= 0.00795025750995) {
                            classes[0] = 25; 
                            classes[1] = 75; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 414; 
                            classes[1] = 53; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[14] <= 5291.45410156) {
                            classes[0] = 17; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 92; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[12] <= 8.42621707916) {
                        classes[0] = 380; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 5; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[13] <= 5.925157547) {
                if (features[10] <= 0.953333377838) {
                    if (features[17] <= 1816.28173828) {
                        classes[0] = 0; 
                        classes[1] = 9; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 6; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[1] <= 0.418420374393) {
                        if (features[26] <= 0.515095472336) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[15] <= -6.1828455925) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 460; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 365; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_49(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 602.32409668) {
            if (features[16] <= 4.98045253754) {
                if (features[12] <= -6.38688898087) {
                    classes[0] = 0; 
                    classes[1] = 17; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[27] <= 0.623763442039) {
                        if (features[30] <= 0.787521243095) {
                            classes[0] = 717; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 13; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[30] <= 0.882764935493) {
                            classes[0] = 63; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 11; 
            }
        } else {
            if (features[16] <= 1.25739860535) {
                if (features[17] <= 63.7078781128) {
                    if (features[10] <= 0.0231345240027) {
                        if (features[12] <= -5.71442747116) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[10] <= 1.44954895973) {
                            classes[0] = 5; 
                            classes[1] = 536; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[11] <= 1385.59057617) {
                        if (features[0] <= -0.0274770315737) {
                            classes[0] = 6; 
                            classes[1] = 11; 
                            classes[2] = 49; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 26; 
                            classes[1] = 197; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[3] <= -0.00204981025308) {
                            classes[0] = 30; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[1] <= 1.71839749813) {
                    if (features[16] <= 4.52764511108) {
                        if (features[4] <= 0.70745909214) {
                            classes[0] = 0; 
                            classes[1] = 13; 
                            classes[2] = 13; 
                            classes[3] = 18; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 1; 
                            classes[2] = 390; 
                            classes[3] = 5; 
                        }
                    } else {
                        if (features[9] <= 0.0610806494951) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 8; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 38; 
                        }
                    }
                } else {
                    if (features[6] <= 2.84174752235) {
                        if (features[20] <= 0.690269708633) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 17; 
                            classes[3] = 343; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 1; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 2; 
                        classes[3] = 0; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_50(double[] features) {
        int[] classes = new int[4];
        
        if (features[15] <= -3.98888254166) {
            if (features[10] <= 3.09932088852) {
                classes[0] = 570; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                if (features[27] <= 0.501207172871) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 1; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[12] <= -9.87000656128) {
                if (features[10] <= 1.38735198975) {
                    if (features[2] <= 0.0553354993463) {
                        if (features[0] <= -0.0075606694445) {
                            classes[0] = 6; 
                            classes[1] = 11; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 360; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[11] <= 114.240600586) {
                            classes[0] = 1; 
                            classes[1] = 41; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 40; 
                            classes[2] = 54; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[7] <= 1.16820275784) {
                        if (features[12] <= -10.621471405) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 259; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[4] <= 0.312109410763) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 21; 
                        }
                    }
                }
            } else {
                if (features[7] <= 0.379305243492) {
                    if (features[11] <= 1967.2253418) {
                        if (features[17] <= 533.770812988) {
                            classes[0] = 10; 
                            classes[1] = 292; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 162; 
                            classes[1] = 7; 
                            classes[2] = 2; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[6] <= -0.156069204211) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 122; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[13] <= 5.40496349335) {
                        if (features[1] <= 0.385055541992) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 207; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 369; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_51(double[] features) {
        int[] classes = new int[4];
        
        if (features[10] <= 1.49383187294) {
            if (features[16] <= 0.0382264405489) {
                if (features[14] <= 4921.92382812) {
                    classes[0] = 462; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[8] <= 5.17733573914) {
                        if (features[2] <= 0.0591832399368) {
                            classes[0] = 0; 
                            classes[1] = 15; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 5; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[15] <= -3.93091821671) {
                    if (features[24] <= 0.312199890614) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 1; 
                    } else {
                        classes[0] = 188; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[11] <= 1590.20227051) {
                        if (features[15] <= 4.52268028259) {
                            classes[0] = 18; 
                            classes[1] = 734; 
                            classes[2] = 69; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 112; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[7] <= 0.0170496068895) {
                            classes[0] = 44; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 15; 
                            classes[1] = 15; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[7] <= 0.993973255157) {
                if (features[13] <= 5.573990345) {
                    if (features[4] <= 0.765967965126) {
                        if (features[11] <= 904.606811523) {
                            classes[0] = 3; 
                            classes[1] = 4; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 16; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 1.07408320904) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 363; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 30; 
                }
            } else {
                if (features[10] <= 3.95260739326) {
                    if (features[25] <= 0.475475013256) {
                        if (features[16] <= 2.72087669373) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 10; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 28; 
                        }
                    } else {
                        if (features[13] <= 5.72190093994) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 62; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 19; 
                        }
                    }
                } else {
                    if (features[12] <= 9.3987903595) {
                        if (features[22] <= 0.367117881775) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 306; 
                        }
                    } else {
                        if (features[28] <= 0.494138598442) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 8; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_52(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1728.24841309) {
            if (features[4] <= 1.14455592632) {
                if (features[12] <= -6.38688898087) {
                    classes[0] = 0; 
                    classes[1] = 17; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[20] <= 0.735806882381) {
                        if (features[25] <= 0.246799007058) {
                            classes[0] = 5; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 809; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= 5.83310651779) {
                            classes[0] = 17; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[21] <= 0.649091899395) {
                    if (features[25] <= 0.590443372726) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 40; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 3; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[13] <= 1.27661895752) {
                if (features[16] <= 0.0385390259326) {
                    if (features[28] <= 0.516932606697) {
                        if (features[13] <= 0.0287943761796) {
                            classes[0] = 0; 
                            classes[1] = 15; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[32] <= 0.452048897743) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[15] <= -3.1030421257) {
                        if (features[22] <= 0.635174512863) {
                            classes[0] = 16; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[0] <= -0.027433399111) {
                            classes[0] = 8; 
                            classes[1] = 36; 
                            classes[2] = 42; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 18; 
                            classes[1] = 692; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[4] <= 1.93391060829) {
                    if (features[7] <= 1.24632787704) {
                        if (features[13] <= 5.70870304108) {
                            classes[0] = 1; 
                            classes[1] = 1; 
                            classes[2] = 386; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 15; 
                        }
                    } else {
                        if (features[9] <= 2.23742437363) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 59; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 34; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    if (features[23] <= 0.904563069344) {
                        if (features[28] <= 0.669873833656) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 13; 
                            classes[3] = 280; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 1; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 2; 
                        classes[3] = 0; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_53(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.498942166567) {
            if (features[14] <= 4202.59472656) {
                if (features[4] <= 0.0366268008947) {
                    if (features[7] <= 0.0809930339456) {
                        if (features[5] <= 85.2637023926) {
                            classes[0] = 683; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[3] <= -6.41360855103) {
                        classes[0] = 0; 
                        classes[1] = 5; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[8] <= -3.73468208313) {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 151; 
                            classes[1] = 13; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[2] <= 0.0553354993463) {
                    if (features[0] <= 0.0251803807914) {
                        if (features[2] <= -10.7378149033) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 578; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[24] <= 0.469235211611) {
                            classes[0] = 1; 
                            classes[1] = 11; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 8; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[8] <= 0.0231672301888) {
                        if (features[9] <= 1.21813082695) {
                            classes[0] = 2; 
                            classes[1] = 11; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 64; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[2] <= 30.9772262573) {
                            classes[0] = 9; 
                            classes[1] = 105; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 3; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[14] <= 5422.56591797) {
                if (features[9] <= 4.58810758591) {
                    if (features[27] <= 0.66008746624) {
                        if (features[4] <= 1.27079868317) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 195; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[4] <= 0.91930603981) {
                        classes[0] = 7; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 27; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[7] <= 1.11383020878) {
                    if (features[4] <= 1.9975631237) {
                        if (features[10] <= 0.963515937328) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 356; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[13] <= 5.19008970261) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 13; 
                        }
                    }
                } else {
                    if (features[13] <= 5.94364929199) {
                        if (features[24] <= 0.391629636288) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 79; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 175; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_54(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 1.50930202007) {
            if (features[30] <= 0.58089196682) {
                if (features[14] <= 4598.98095703) {
                    if (features[11] <= 1.38118326664) {
                        if (features[19] <= 0.440475463867) {
                            classes[0] = 6; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[10] <= 0.337723076344) {
                            classes[0] = 643; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 58; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[9] <= 4.25910425186) {
                        if (features[9] <= 0.223458826542) {
                            classes[0] = 15; 
                            classes[1] = 340; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 55; 
                            classes[2] = 31; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 12; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[16] <= 0.036515943706) {
                    if (features[8] <= 0.00666118552908) {
                        if (features[18] <= 0.378054916859) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 39; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[15] <= -5.28473472595) {
                        classes[0] = 50; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[14] <= 426.340148926) {
                            classes[0] = 31; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 355; 
                            classes[2] = 36; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[22] <= 0.451179862022) {
                if (features[6] <= -0.286461859941) {
                    if (features[10] <= 4.2690486908) {
                        if (features[16] <= 2.21406459808) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 4; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 21; 
                    }
                } else {
                    if (features[10] <= 3.48949098587) {
                        if (features[6] <= 0.480532675982) {
                            classes[0] = 2; 
                            classes[1] = 2; 
                            classes[2] = 249; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[8] <= 234.398452759) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 10; 
                            classes[3] = 83; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[10] <= 3.65332651138) {
                    if (features[17] <= 719.494140625) {
                        if (features[16] <= 4.83646297455) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 147; 
                            classes[3] = 12; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[16] <= 3.92199921608) {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    }
                } else {
                    if (features[4] <= 1.6797837019) {
                        if (features[13] <= 4.98675298691) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 13; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 29; 
                        }
                    } else {
                        if (features[5] <= 3666.49365234) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 254; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_55(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 1.36087274551) {
            if (features[11] <= 1396.59790039) {
                if (features[6] <= 0.00453532626852) {
                    if (features[17] <= 623.284301758) {
                        if (features[2] <= -34.6250610352) {
                            classes[0] = 7; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 24; 
                            classes[1] = 355; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= -6.29010009766) {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 63; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[1] <= 0.0055002393201) {
                        if (features[17] <= 394.857513428) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 160; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[15] <= -5.82211923599) {
                            classes[0] = 154; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 67; 
                            classes[1] = 341; 
                            classes[2] = 66; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[23] <= 0.217375680804) {
                    if (features[8] <= 1265.31274414) {
                        classes[0] = 8; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[8] <= 2784.56835938) {
                            classes[0] = 0; 
                            classes[1] = 16; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[25] <= 0.297151446342) {
                        if (features[11] <= 1851.96362305) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 37.2386817932) {
                            classes[0] = 0; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 345; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[10] <= 3.54414319992) {
                if (features[11] <= 3511.02392578) {
                    if (features[6] <= 0.378885984421) {
                        if (features[28] <= 0.728648841381) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 409; 
                            classes[3] = 11; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[29] <= 0.485252559185) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 8; 
                        }
                    }
                } else {
                    classes[0] = 10; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[13] <= 5.01453828812) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 49; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 424; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_56(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.530741810799) {
            if (features[15] <= -2.95187973976) {
                if (features[20] <= 0.214054077864) {
                    if (features[26] <= 0.398429989815) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 1; 
                    } else {
                        classes[0] = 1; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 566; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[15] <= 3.83518338203) {
                    if (features[0] <= -0.0330093801022) {
                        if (features[3] <= -0.00664015673101) {
                            classes[0] = 23; 
                            classes[1] = 20; 
                            classes[2] = 8; 
                            classes[3] = 8; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 6; 
                            classes[2] = 66; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[11] <= 3972.99902344) {
                            classes[0] = 16; 
                            classes[1] = 695; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 19; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 223; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[13] <= 5.70870304108) {
                if (features[21] <= 0.219246953726) {
                    if (features[6] <= -0.0752289667726) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 5; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[13] <= 0.949890494347) {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[25] <= 0.254122704268) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 483; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[27] <= 0.51324981451) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 336; 
                } else {
                    if (features[27] <= 0.514626979828) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 78; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_57(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.498942166567) {
            if (features[2] <= 0.0680395662785) {
                if (features[16] <= 0.036483142525) {
                    if (features[17] <= 54.499382019) {
                        classes[0] = 0; 
                        classes[1] = 14; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[19] <= 0.714856028557) {
                            classes[0] = 348; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 35; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[30] <= 0.341752052307) {
                        if (features[22] <= 0.584300041199) {
                            classes[0] = 43; 
                            classes[1] = 15; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 13; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 556.817260742) {
                            classes[0] = 13; 
                            classes[1] = 591; 
                            classes[2] = 4; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 92; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    }
                }
            } else {
                if (features[14] <= 4644.43945312) {
                    if (features[31] <= 0.694360375404) {
                        if (features[3] <= -3.55813980103) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 301; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[19] <= 0.085016220808) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 18; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[7] <= 0.0153735522181) {
                        if (features[0] <= -0.0221949853003) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 44; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[2] <= 106.852737427) {
                            classes[0] = 1; 
                            classes[1] = 99; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[16] <= 4.01334857941) {
                if (features[7] <= 1.34110069275) {
                    if (features[32] <= 0.699297785759) {
                        if (features[32] <= 0.230266749859) {
                            classes[0] = 1; 
                            classes[1] = 3; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 406; 
                            classes[3] = 7; 
                        }
                    } else {
                        if (features[6] <= -0.868078589439) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 2; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[22] <= 0.546284556389) {
                        if (features[12] <= 9.20066070557) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 22; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 39; 
                            classes[3] = 1; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 23; 
                    }
                }
            } else {
                if (features[10] <= 3.41798353195) {
                    if (features[13] <= 7.05883216858) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 14; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 8; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 340; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_58(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 1033.65795898) {
            if (features[5] <= 5.0122385025) {
                if (features[1] <= 0.661277770996) {
                    if (features[9] <= 5.17063999176) {
                        if (features[9] <= 0.715405523777) {
                            classes[0] = 5; 
                            classes[1] = 561; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 166; 
                            classes[2] = 75; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 88; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[14] <= 5306.59375) {
                        if (features[1] <= 1.36461400986) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 11; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 74; 
                        }
                    } else {
                        if (features[13] <= 6.29242324829) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 157; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 60; 
                        }
                    }
                }
            } else {
                if (features[4] <= 1.83076477051) {
                    if (features[8] <= 40.0615882874) {
                        if (features[4] <= 0.72943007946) {
                            classes[0] = 10; 
                            classes[1] = 17; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 218; 
                            classes[3] = 16; 
                        }
                    } else {
                        if (features[16] <= 2.49497199059) {
                            classes[0] = 2; 
                            classes[1] = 10; 
                            classes[2] = 27; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 24; 
                        }
                    }
                } else {
                    if (features[12] <= -10.0710296631) {
                        if (features[27] <= 0.379886627197) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[28] <= 0.57314157486) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 153; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 17; 
                        }
                    }
                }
            }
        } else {
            if (features[10] <= 2.94099712372) {
                if (features[8] <= 1.66303873062) {
                    if (features[14] <= -374.33001709) {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[12] <= 8.34012126923) {
                            classes[0] = 747; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 12; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[15] <= -3.86971879005) {
                        if (features[17] <= 5768.5703125) {
                            classes[0] = 17; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[9] <= -0.544742643833) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[14] <= 1166.81359863) {
                    if (features[2] <= 144.759262085) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 7; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 1; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 31; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_59(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1729.83325195) {
            if (features[16] <= 4.28914451599) {
                if (features[3] <= -6.41360855103) {
                    classes[0] = 0; 
                    classes[1] = 9; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[13] <= 2.82222223282) {
                        if (features[14] <= -79.9946899414) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 829; 
                            classes[1] = 18; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[31] <= 0.774017333984) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 44; 
            }
        } else {
            if (features[10] <= 1.29925298691) {
                if (features[14] <= 6503.03320312) {
                    if (features[0] <= -0.0340808182955) {
                        if (features[1] <= 0.0618273094296) {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 51; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 21; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 4629.59765625) {
                            classes[0] = 9; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 702; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[6] <= -0.135748788714) {
                        classes[0] = 0; 
                        classes[1] = 7; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 12; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[14] <= 5712.50732422) {
                    if (features[17] <= 67.5322723389) {
                        if (features[13] <= 5.12115383148) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 42; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 78; 
                        }
                    } else {
                        if (features[22] <= 0.381910204887) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 116; 
                        }
                    }
                } else {
                    if (features[1] <= 1.93216502666) {
                        if (features[10] <= 4.42372894287) {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 409; 
                            classes[3] = 10; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 15; 
                        }
                    } else {
                        if (features[15] <= -4.06134033203) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 131; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_60(double[] features) {
        int[] classes = new int[4];
        
        if (features[10] <= 1.36454236507) {
            if (features[31] <= 0.582410395145) {
                if (features[12] <= -5.96531009674) {
                    if (features[3] <= -0.0294087976217) {
                        if (features[5] <= -0.150334954262) {
                            classes[0] = 4; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 263; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 0.550647377968) {
                            classes[0] = 10; 
                            classes[1] = 16; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 28; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 0.0396830402315) {
                        if (features[12] <= 8.218791008) {
                            classes[0] = 442; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 15; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[11] <= 761.792053223) {
                            classes[0] = 112; 
                            classes[1] = 87; 
                            classes[2] = 10; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 134; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[9] <= 5.15000391006) {
                    if (features[12] <= -5.61293506622) {
                        if (features[4] <= 0.0271728504449) {
                            classes[0] = 2; 
                            classes[1] = 71; 
                            classes[2] = 26; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 176; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 2771.92822266) {
                            classes[0] = 70; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 82; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[12] <= -5.98139476776) {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 33; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[12] <= -9.87496948242) {
                if (features[4] <= 2.24384117126) {
                    if (features[8] <= 92.156539917) {
                        if (features[10] <= 4.46050357819) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 231; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[16] <= 2.30182623863) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 10; 
                        }
                    }
                } else {
                    if (features[4] <= 2.7241063118) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 7; 
                    } else {
                        if (features[8] <= -8.28350830078) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[4] <= 1.75736641884) {
                    if (features[17] <= 979.033447266) {
                        if (features[12] <= 9.1384677887) {
                            classes[0] = 1; 
                            classes[1] = 1; 
                            classes[2] = 34; 
                            classes[3] = 40; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 156; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[13] <= 3.51265740395) {
                            classes[0] = 34; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 2; 
                        }
                    }
                } else {
                    if (features[12] <= 9.56645107269) {
                        if (features[16] <= 2.73435378075) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 374; 
                        }
                    } else {
                        if (features[1] <= 1.68693947792) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 15; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 17; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_61(double[] features) {
        int[] classes = new int[4];
        
        if (features[16] <= 1.23936772346) {
            if (features[30] <= 0.505591154099) {
                if (features[17] <= 583.648803711) {
                    if (features[9] <= 4.07224273682) {
                        if (features[16] <= 1.07625865936) {
                            classes[0] = 14; 
                            classes[1] = 240; 
                            classes[2] = 10; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 46; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[26] <= 0.686103343964) {
                        if (features[12] <= -6.72802066803) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 494; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[22] <= 0.346030950546) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[14] <= 3650.96289062) {
                    if (features[23] <= 0.0980813652277) {
                        classes[0] = 0; 
                        classes[1] = 5; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[4] <= 0.0174042079598) {
                            classes[0] = 132; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 98; 
                            classes[1] = 24; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[9] <= 1.39195275307) {
                        if (features[21] <= 0.394863218069) {
                            classes[0] = 7; 
                            classes[1] = 38; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 359; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 145.7394104) {
                            classes[0] = 0; 
                            classes[1] = 39; 
                            classes[2] = 48; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 60; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[1] <= 1.81816792488) {
                if (features[4] <= 0.70613360405) {
                    if (features[11] <= 415.862915039) {
                        if (features[13] <= 5.28108167648) {
                            classes[0] = 3; 
                            classes[1] = 15; 
                            classes[2] = 17; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 21; 
                        }
                    } else {
                        classes[0] = 32; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[5] <= -96.3840179443) {
                        if (features[1] <= 0.781689405441) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 7; 
                        }
                    } else {
                        if (features[7] <= 1.64478445053) {
                            classes[0] = 1; 
                            classes[1] = 8; 
                            classes[2] = 444; 
                            classes[3] = 11; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 21; 
                        }
                    }
                }
            } else {
                if (features[10] <= 3.06587195396) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 6; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 323; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_62(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 1035.75) {
            if (features[5] <= 5.25548648834) {
                if (features[7] <= 0.340309977531) {
                    if (features[9] <= 6.87282180786) {
                        if (features[15] <= -0.89685177803) {
                            classes[0] = 12; 
                            classes[1] = 142; 
                            classes[2] = 48; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 568; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 59; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[16] <= 3.8759739399) {
                        if (features[14] <= 3879.79638672) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 165; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[22] <= 0.414510369301) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 113; 
                        }
                    }
                }
            } else {
                if (features[16] <= 4.21413135529) {
                    if (features[23] <= 0.69652146101) {
                        if (features[0] <= 0.471769124269) {
                            classes[0] = 7; 
                            classes[1] = 26; 
                            classes[2] = 272; 
                            classes[3] = 11; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 11; 
                        }
                    } else {
                        if (features[13] <= 4.0763630867) {
                            classes[0] = 6; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 14; 
                        }
                    }
                } else {
                    if (features[12] <= -10.0322465897) {
                        if (features[12] <= -10.3405952454) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[15] <= -4.37982177734) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 203; 
                        }
                    }
                }
            }
        } else {
            if (features[4] <= 1.17942249775) {
                if (features[8] <= -5.1354470253) {
                    if (features[22] <= 0.463305056095) {
                        classes[0] = 0; 
                        classes[1] = 4; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 1; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[24] <= 0.845656335354) {
                        if (features[3] <= -3.56975317001) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 789; 
                            classes[1] = 14; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 3; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[21] <= 0.666200041771) {
                    if (features[4] <= 1.71022558212) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 33; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 3; 
                    classes[3] = 0; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_63(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 593.916809082) {
            if (features[7] <= 0.963701605797) {
                if (features[23] <= 0.0592863336205) {
                    if (features[25] <= 0.713114976883) {
                        classes[0] = 0; 
                        classes[1] = 4; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 3; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[14] <= -383.018890381) {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[32] <= 0.935127258301) {
                            classes[0] = 807; 
                            classes[1] = 13; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 11; 
            }
        } else {
            if (features[13] <= 1.27661895752) {
                if (features[22] <= 0.543954968452) {
                    if (features[9] <= 4.63160705566) {
                        if (features[6] <= 0.00453532626852) {
                            classes[0] = 11; 
                            classes[1] = 237; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 57; 
                            classes[2] = 49; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[31] <= 0.584525823593) {
                            classes[0] = 26; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[15] <= -1.03546845913) {
                        if (features[5] <= 0.033934764564) {
                            classes[0] = 8; 
                            classes[1] = 10; 
                            classes[2] = 17; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 37; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 6.9498925209) {
                            classes[0] = 0; 
                            classes[1] = 369; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[12] <= -9.87411499023) {
                    if (features[16] <= 5.11192989349) {
                        if (features[4] <= 0.657121419907) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 17; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 223; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 6; 
                    }
                } else {
                    if (features[1] <= 1.42631804943) {
                        if (features[13] <= 5.52367925644) {
                            classes[0] = 8; 
                            classes[1] = 1; 
                            classes[2] = 230; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 39; 
                        }
                    } else {
                        if (features[13] <= 6.50438213348) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 325; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_64(double[] features) {
        int[] classes = new int[4];
        
        if (features[15] <= -2.95896720886) {
            if (features[4] <= 1.57332706451) {
                if (features[25] <= 0.161658659577) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 2; 
                } else {
                    if (features[1] <= 0.888021349907) {
                        classes[0] = 560; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 2; 
                        classes[3] = 0; 
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 17; 
            }
        } else {
            if (features[16] <= 1.18121373653) {
                if (features[15] <= 3.84853196144) {
                    if (features[0] <= -0.027433399111) {
                        if (features[10] <= 0.19497191906) {
                            classes[0] = 15; 
                            classes[1] = 5; 
                            classes[2] = 79; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 32; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[16] <= 0.0182684976608) {
                            classes[0] = 20; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 15; 
                            classes[1] = 762; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 212; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[1] <= 1.64351916313) {
                    if (features[10] <= 3.97487235069) {
                        if (features[20] <= 0.208037674427) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 9; 
                            classes[2] = 421; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[15] <= -0.20142172277) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 36; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 10; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[19] <= 0.886600553989) {
                        if (features[7] <= 0.740119814873) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 11; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 303; 
                        }
                    } else {
                        if (features[7] <= 1.1036093235) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 17; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_65(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.498942166567) {
            if (features[15] <= -2.93919610977) {
                if (features[27] <= 0.145089775324) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 1; 
                } else {
                    if (features[30] <= 0.703807592392) {
                        classes[0] = 580; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[32] <= 0.218399450183) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 14; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[8] <= 0.0341328606009) {
                    if (features[14] <= 2635.73193359) {
                        if (features[16] <= 0.16522487998) {
                            classes[0] = 132; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 6401.28125) {
                            classes[0] = 3; 
                            classes[1] = 173; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 6; 
                            classes[2] = 61; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[12] <= -5.53845834732) {
                        if (features[0] <= -0.00627675745636) {
                            classes[0] = 11; 
                            classes[1] = 70; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 459; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[15] <= 0.460461050272) {
                            classes[0] = 16; 
                            classes[1] = 47; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 128; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[19] <= 0.130259126425) {
                if (features[16] <= 3.03430843353) {
                    if (features[1] <= 0.655784487724) {
                        classes[0] = 0; 
                        classes[1] = 3; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 11; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 141; 
                }
            } else {
                if (features[13] <= 5.70870304108) {
                    if (features[14] <= 779.033935547) {
                        if (features[10] <= 3.6174018383) {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[32] <= 0.708060741425) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 421; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[22] <= 0.347829282284) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        if (features[20] <= 0.649236381054) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 244; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 6; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_66(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 602.271179199) {
            if (features[13] <= 3.13327407837) {
                if (features[31] <= 0.769761383533) {
                    if (features[11] <= 1.69297862053) {
                        if (features[25] <= 0.454877316952) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[26] <= 0.199000239372) {
                            classes[0] = 1; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 769; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[2] <= 0.309768795967) {
                        classes[0] = 8; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[29] <= 0.549555540085) {
                            classes[0] = 2; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[32] <= 0.202118650079) {
                    classes[0] = 2; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 14; 
                }
            }
        } else {
            if (features[16] <= 1.2474155426) {
                if (features[11] <= 2468.00610352) {
                    if (features[17] <= 62.400894165) {
                        if (features[31] <= 0.121741503477) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 524; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 0.050966963172) {
                            classes[0] = 16; 
                            classes[1] = 27; 
                            classes[2] = 47; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 25; 
                            classes[1] = 152; 
                            classes[2] = 17; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 32; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[8] <= -32.0208435059) {
                    if (features[30] <= 0.405462324619) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 46; 
                    } else {
                        if (features[10] <= 3.94296693802) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 46; 
                        }
                    }
                } else {
                    if (features[7] <= 0.953802704811) {
                        if (features[0] <= 0.447109729052) {
                            classes[0] = 4; 
                            classes[1] = 15; 
                            classes[2] = 361; 
                            classes[3] = 8; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 8; 
                        }
                    } else {
                        if (features[1] <= 1.6204739809) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 93; 
                            classes[3] = 35; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 251; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_67(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 614.093261719) {
            if (features[1] <= 0.9029302001) {
                if (features[3] <= -6.41293668747) {
                    classes[0] = 0; 
                    classes[1] = 6; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[8] <= -0.20853959024) {
                        if (features[12] <= -5.78974485397) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 13; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[31] <= 0.762398600578) {
                            classes[0] = 761; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 14; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[13] <= 5.39031362534) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 11; 
                }
            }
        } else {
            if (features[1] <= 0.423180669546) {
                if (features[0] <= -0.0308883227408) {
                    if (features[12] <= -10.0918884277) {
                        if (features[5] <= 2636.37060547) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 49; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[4] <= 0.0891864448786) {
                            classes[0] = 17; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 7; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 18; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[11] <= 2485.78540039) {
                        if (features[9] <= 4.80431747437) {
                            classes[0] = 23; 
                            classes[1] = 722; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 25; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 16; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[14] <= 5429.78515625) {
                    if (features[4] <= 1.67328429222) {
                        if (features[10] <= 4.85022926331) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 24; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 8; 
                        }
                    } else {
                        if (features[28] <= 0.394444286823) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 38; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 172; 
                        }
                    }
                } else {
                    if (features[16] <= 3.95386791229) {
                        if (features[13] <= 5.40875339508) {
                            classes[0] = 0; 
                            classes[1] = 8; 
                            classes[2] = 397; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 34; 
                        }
                    } else {
                        if (features[7] <= 0.985229849815) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 14; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 130; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_68(double[] features) {
        int[] classes = new int[4];
        
        if (features[9] <= 4.63160705566) {
            if (features[1] <= 0.498942166567) {
                if (features[16] <= 0.0383306220174) {
                    if (features[17] <= 1223.45263672) {
                        if (features[2] <= 0.0512643046677) {
                            classes[0] = 0; 
                            classes[1] = 17; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 290; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[17] <= 2026.87182617) {
                        if (features[0] <= -0.0330093801022) {
                            classes[0] = 0; 
                            classes[1] = 28; 
                            classes[2] = 60; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 27; 
                            classes[1] = 660; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[3] <= -4.92437314987) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 192; 
                            classes[1] = 18; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                }
            } else {
                if (features[1] <= 1.61917662621) {
                    if (features[8] <= 100.559524536) {
                        if (features[22] <= 0.636801958084) {
                            classes[0] = 3; 
                            classes[1] = 2; 
                            classes[2] = 391; 
                            classes[3] = 17; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 11; 
                        }
                    } else {
                        if (features[16] <= 2.49497199059) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 11; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 29; 
                        }
                    }
                } else {
                    if (features[13] <= 6.35976219177) {
                        if (features[5] <= -40.3414726257) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 26; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 321; 
                    }
                }
            }
        } else {
            if (features[16] <= 2.63811063766) {
                if (features[15] <= -0.671079516411) {
                    classes[0] = 314; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[10] <= 0.145102262497) {
                        classes[0] = 71; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[30] <= 0.588091611862) {
                            classes[0] = 16; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 13; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[21] <= 0.420709848404) {
                    classes[0] = 2; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[31] <= 0.459480404854) {
                        classes[0] = 1; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 15; 
                        classes[3] = 0; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_69(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 642.587646484) {
            if (features[14] <= -79.9946899414) {
                if (features[10] <= 2.69089961052) {
                    classes[0] = 0; 
                    classes[1] = 3; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 3; 
                }
            } else {
                if (features[13] <= 3.1652200222) {
                    if (features[27] <= 0.124918967485) {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[26] <= 0.199000239372) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 746; 
                            classes[1] = 13; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[13] <= 3.67211699486) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        if (features[31] <= 0.826087355614) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[22] <= 0.549938678741) {
                if (features[16] <= 1.41496992111) {
                    if (features[16] <= 0.0467046424747) {
                        if (features[13] <= 0.0220247358084) {
                            classes[0] = 12; 
                            classes[1] = 20; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 16; 
                            classes[1] = 4; 
                            classes[2] = 12; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[4] <= 0.956714749336) {
                            classes[0] = 39; 
                            classes[1] = 294; 
                            classes[2] = 36; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 10; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 4.02333068848) {
                        if (features[7] <= 1.05377721786) {
                            classes[0] = 3; 
                            classes[1] = 2; 
                            classes[2] = 362; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 75; 
                            classes[3] = 35; 
                        }
                    } else {
                        if (features[4] <= 1.34703302383) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 12; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 267; 
                        }
                    }
                }
            } else {
                if (features[1] <= 0.618010759354) {
                    if (features[9] <= 4.79015159607) {
                        if (features[2] <= 0.0614367574453) {
                            classes[0] = 4; 
                            classes[1] = 394; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 39; 
                            classes[2] = 16; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 11; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[28] <= 0.584594845772) {
                        if (features[19] <= 0.18617478013) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 44; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 31; 
                        }
                    } else {
                        if (features[14] <= 4698.39013672) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 12; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 10; 
                            classes[3] = 1; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_70(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.530741810799) {
            if (features[14] <= 4145.15332031) {
                if (features[14] <= -79.9946899414) {
                    classes[0] = 0; 
                    classes[1] = 4; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[3] <= -3.56975317001) {
                        if (features[1] <= 0.0424139983952) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[30] <= 0.882793068886) {
                            classes[0] = 854; 
                            classes[1] = 21; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[2] <= 0.0564826503396) {
                    if (features[3] <= -2.09174561501) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 2; 
                    } else {
                        if (features[28] <= 0.875482916832) {
                            classes[0] = 14; 
                            classes[1] = 570; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[0] <= -0.0247263424098) {
                        if (features[1] <= 0.0603842511773) {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 51; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 11; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[2] <= 2.55388975143) {
                            classes[0] = 1; 
                            classes[1] = 101; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 14; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[13] <= 5.70870304108) {
                if (features[28] <= 0.764645814896) {
                    if (features[10] <= 0.843536138535) {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[15] <= -4.46433591843) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 474; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 2; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[27] <= 0.604551076889) {
                    if (features[15] <= -4.34447383881) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 401; 
                    }
                } else {
                    if (features[28] <= 0.565734148026) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 11; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_71(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1734.21374512) {
            if (features[1] <= 0.834729194641) {
                if (features[10] <= 0.1170752123) {
                    if (features[31] <= 0.808992743492) {
                        if (features[12] <= -6.31421327591) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 608; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[15] <= 4.25142765045) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[14] <= 229.80279541) {
                        if (features[14] <= -374.0859375) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 179; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[26] <= 0.417036116123) {
                            classes[0] = 6; 
                            classes[1] = 24; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 34; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 41; 
            }
        } else {
            if (features[7] <= 0.350086152554) {
                if (features[8] <= 2.95421457291) {
                    if (features[6] <= 0.0228351354599) {
                        if (features[0] <= -0.0335669182241) {
                            classes[0] = 1; 
                            classes[1] = 13; 
                            classes[2] = 52; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 32; 
                            classes[1] = 336; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[5] <= -3.46439409256) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 370; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 3.80092310905) {
                        if (features[5] <= 2665.5793457) {
                            classes[0] = 23; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 3; 
                    }
                }
            } else {
                if (features[7] <= 0.968615651131) {
                    if (features[18] <= 0.676704108715) {
                        if (features[5] <= 131.27734375) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 365; 
                            classes[3] = 8; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 4; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[11] <= 85.8174285889) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 9; 
                        }
                    }
                } else {
                    if (features[13] <= 5.40948724747) {
                        if (features[13] <= 0.893393278122) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 97; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 313; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_72(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.481204628944) {
            if (features[16] <= 0.0382370650768) {
                if (features[12] <= 8.20524787903) {
                    if (features[1] <= 0.00518775591627) {
                        classes[0] = 342; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[12] <= -6.28796243668) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 152; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 19; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[12] <= -6.3851647377) {
                    if (features[32] <= 0.545261025429) {
                        if (features[8] <= 0.0225642509758) {
                            classes[0] = 0; 
                            classes[1] = 8; 
                            classes[2] = 52; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 120; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[12] <= -10.1592636108) {
                            classes[0] = 5; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 418; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    if (features[15] <= -2.47887277603) {
                        if (features[16] <= 2.72241449356) {
                            classes[0] = 186; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[15] <= 0.761778950691) {
                            classes[0] = 4; 
                            classes[1] = 211; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 158; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[2] <= -82.079574585) {
                if (features[1] <= 1.68464255333) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 3; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 86; 
                }
            } else {
                if (features[16] <= 4.0231628418) {
                    if (features[6] <= -2.03876924515) {
                        if (features[11] <= 6.99560308456) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 12; 
                        }
                    } else {
                        if (features[19] <= 0.0900966227055) {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 3; 
                            classes[3] = 10; 
                        } else {
                            classes[0] = 8; 
                            classes[1] = 3; 
                            classes[2] = 434; 
                            classes[3] = 12; 
                        }
                    }
                } else {
                    if (features[25] <= 0.642259836197) {
                        if (features[16] <= 4.6400437355) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 26; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 239; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 2; 
                        classes[3] = 0; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_73(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 1.38004362583) {
            if (features[14] <= 4598.98095703) {
                if (features[3] <= -6.41360855103) {
                    classes[0] = 0; 
                    classes[1] = 13; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[30] <= 0.670912981033) {
                        if (features[4] <= 0.0279388725758) {
                            classes[0] = 592; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 182; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 3267.00732422) {
                            classes[0] = 11; 
                            classes[1] = 13; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 39; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[8] <= 0.0212355144322) {
                    if (features[14] <= 6399.75537109) {
                        if (features[9] <= 4.1977148056) {
                            classes[0] = 2; 
                            classes[1] = 146; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[11] <= 80.1475906372) {
                            classes[0] = 2; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 62; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[9] <= 5.15017986298) {
                        if (features[4] <= 1.05712008476) {
                            classes[0] = 6; 
                            classes[1] = 603; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[19] <= 0.468553125858) {
                            classes[0] = 2; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[10] <= 3.41546702385) {
                if (features[0] <= 0.391797304153) {
                    if (features[14] <= 3603.06762695) {
                        if (features[8] <= -7.24561023712) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[8] <= 167.371276855) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 398; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 3; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 7; 
                }
            } else {
                if (features[12] <= 9.40240097046) {
                    if (features[11] <= 1804.61535645) {
                        if (features[17] <= 3115.88061523) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 348; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 2567.45410156) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 7; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 13; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[1] <= 1.31694793701) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 26; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 23; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_74(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 1.36087274551) {
            if (features[12] <= -5.97079229355) {
                if (features[2] <= 0.0564826503396) {
                    if (features[0] <= -0.0331184640527) {
                        if (features[24] <= 0.438038766384) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[3] <= 0.0103829195723) {
                            classes[0] = 2; 
                            classes[1] = 423; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[3] <= -0.0277012102306) {
                        classes[0] = 0; 
                        classes[1] = 96; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[6] <= -0.0302596464753) {
                            classes[0] = 0; 
                            classes[1] = 17; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 60; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[16] <= 0.0383412465453) {
                    if (features[9] <= -0.243163496256) {
                        if (features[2] <= 0.0367528647184) {
                            classes[0] = 10; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 65; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[7] <= 0.00281022838317) {
                            classes[0] = 65; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 354; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[12] <= 8.28757667542) {
                        classes[0] = 336; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[5] <= 30.1595287323) {
                            classes[0] = 0; 
                            classes[1] = 205; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[1] <= 1.61917662621) {
                if (features[4] <= 2.02537584305) {
                    if (features[1] <= 0.507479906082) {
                        if (features[5] <= 2.26858234406) {
                            classes[0] = 12; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 3; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[0] <= 0.533246636391) {
                            classes[0] = 4; 
                            classes[1] = 1; 
                            classes[2] = 433; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 8; 
                        }
                    }
                } else {
                    if (features[21] <= 0.438432872295) {
                        if (features[2] <= 8.32040596008) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[16] <= 4.04787254333) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 31; 
                        }
                    }
                }
            } else {
                if (features[26] <= 0.557861685753) {
                    if (features[10] <= 3.37113380432) {
                        if (features[14] <= 7429.265625) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 10; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[12] <= -10.2216873169) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 313; 
                        }
                    }
                } else {
                    if (features[8] <= -7.2516374588) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 20; 
                    } else {
                        if (features[7] <= 0.981905579567) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 13; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 18; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_75(double[] features) {
        int[] classes = new int[4];
        
        if (features[12] <= -5.62000370026) {
            if (features[10] <= 1.44037699699) {
                if (features[3] <= -0.00617441581562) {
                    if (features[0] <= -0.0316310413182) {
                        if (features[7] <= 0.0437348894775) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 15; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= -10.1596670151) {
                            classes[0] = 3; 
                            classes[1] = 11; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 478; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[2] <= 0.0551738291979) {
                        if (features[31] <= 0.43822735548) {
                            classes[0] = 6; 
                            classes[1] = 2; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 29; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[5] <= 0.37467032671) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 62; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 12; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[12] <= -9.87000656128) {
                    if (features[13] <= 5.42212295532) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 261; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 23; 
                    }
                } else {
                    if (features[15] <= -0.45108371973) {
                        if (features[10] <= 3.35756492615) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 159; 
                        }
                    } else {
                        if (features[10] <= 5.371571064) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 30; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    }
                }
            }
        } else {
            if (features[1] <= 0.530741810799) {
                if (features[9] <= 0.116137780249) {
                    if (features[14] <= 4871.8046875) {
                        if (features[26] <= 0.396993935108) {
                            classes[0] = 15; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 164; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[2] <= 27.8887939453) {
                            classes[0] = 2; 
                            classes[1] = 155; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[15] <= -2.47887277603) {
                        classes[0] = 545; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[5] <= 8.1095790863) {
                            classes[0] = 105; 
                            classes[1] = 35; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 1; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[23] <= 0.605674147606) {
                    if (features[7] <= 1.74585604668) {
                        if (features[12] <= 9.13624000549) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 28; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 159; 
                            classes[3] = 23; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 92; 
                    }
                } else {
                    if (features[1] <= 1.16805005074) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 6; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 94; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_76(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.36450317502) {
            if (features[17] <= 554.013916016) {
                if (features[14] <= 4531.63427734) {
                    if (features[30] <= 0.591000676155) {
                        classes[0] = 36; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[30] <= 0.757517933846) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[6] <= 0.0208710171282) {
                        if (features[9] <= 0.958179473877) {
                            classes[0] = 17; 
                            classes[1] = 201; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 114; 
                            classes[2] = 76; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= -4.42455148697) {
                            classes[0] = 0; 
                            classes[1] = 400; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 24; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[3] <= -3.56678342819) {
                    if (features[16] <= 3.50255846977) {
                        classes[0] = 0; 
                        classes[1] = 6; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 2; 
                    }
                } else {
                    if (features[14] <= -55.7967033386) {
                        classes[0] = 0; 
                        classes[1] = 4; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[13] <= 3.58285617828) {
                            classes[0] = 751; 
                            classes[1] = 12; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    }
                }
            }
        } else {
            if (features[7] <= 1.00994968414) {
                if (features[18] <= 0.669096946716) {
                    if (features[8] <= -14.608795166) {
                        if (features[4] <= 1.68163490295) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 10; 
                        }
                    } else {
                        if (features[1] <= 2.10261535645) {
                            classes[0] = 6; 
                            classes[1] = 2; 
                            classes[2] = 382; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 9; 
                        }
                    }
                } else {
                    if (features[23] <= 0.258942127228) {
                        if (features[15] <= -1.6697704792) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[21] <= 0.433749705553) {
                            classes[0] = 1; 
                            classes[1] = 2; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 11; 
                        }
                    }
                }
            } else {
                if (features[28] <= 0.544540047646) {
                    if (features[6] <= -1.17071461678) {
                        if (features[0] <= -0.189057677984) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 13; 
                        }
                    } else {
                        if (features[16] <= 2.91688847542) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 251; 
                        }
                    }
                } else {
                    if (features[9] <= 2.02664422989) {
                        if (features[5] <= 716.684997559) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 90; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 13; 
                            classes[3] = 5; 
                        }
                    } else {
                        if (features[16] <= 3.13396644592) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 44; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 15; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_77(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 593.916809082) {
            if (features[7] <= 0.733672142029) {
                if (features[27] <= 0.148072242737) {
                    classes[0] = 0; 
                    classes[1] = 4; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[26] <= 0.274280160666) {
                        classes[0] = 0; 
                        classes[1] = 4; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[2] <= 3145.80126953) {
                            classes[0] = 848; 
                            classes[1] = 19; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[9] <= 4.94947528839) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 16; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[10] <= 1.36905610561) {
                if (features[17] <= 58.2209510803) {
                    if (features[15] <= -2.54976320267) {
                        classes[0] = 5; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[9] <= 4.60654830933) {
                            classes[0] = 1; 
                            classes[1] = 504; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[14] <= 4598.98095703) {
                        if (features[16] <= 0.0474121570587) {
                            classes[0] = 20; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 15; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= -10.0962533951) {
                            classes[0] = 19; 
                            classes[1] = 79; 
                            classes[2] = 49; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 13; 
                            classes[1] = 139; 
                            classes[2] = 9; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[7] <= 1.04772651196) {
                    if (features[13] <= 6.30042695999) {
                        if (features[13] <= 1.01749873161) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 348; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 33; 
                    }
                } else {
                    if (features[10] <= 3.50430345535) {
                        if (features[13] <= 6.25714206696) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 42; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 7; 
                        }
                    } else {
                        if (features[14] <= 5624.99511719) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 181; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 28; 
                            classes[3] = 142; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_78(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1729.83325195) {
            if (features[11] <= 1.69746923447) {
                if (features[16] <= 4.32801532745) {
                    if (features[12] <= 7.17761230469) {
                        if (features[6] <= -0.23915079236) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 10; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 13; 
                }
            } else {
                if (features[1] <= 0.956963658333) {
                    if (features[6] <= -0.157698184252) {
                        if (features[6] <= -4.04232311249) {
                            classes[0] = 21; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 17; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[32] <= 0.943619966507) {
                            classes[0] = 800; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    }
                } else {
                    if (features[28] <= 0.651100277901) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 27; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 2; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[1] <= 0.423180669546) {
                if (features[0] <= -0.03409473598) {
                    if (features[13] <= 0.123478055) {
                        if (features[0] <= -0.14635707438) {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 59; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[26] <= 0.494992166758) {
                            classes[0] = 0; 
                            classes[1] = 15; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    }
                } else {
                    if (features[15] <= -4.17450428009) {
                        classes[0] = 22; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[12] <= -10.1595096588) {
                            classes[0] = 14; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 700; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[10] <= 3.48541665077) {
                    if (features[24] <= 0.291596144438) {
                        if (features[32] <= 0.725906014442) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[30] <= 0.862274587154) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 427; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[9] <= 2.34294486046) {
                        if (features[4] <= 1.73450493813) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 36; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 257; 
                        }
                    } else {
                        if (features[15] <= -1.50797176361) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 18; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 33; 
                            classes[3] = 5; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_79(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.481204628944) {
            if (features[8] <= 0.150081545115) {
                if (features[16] <= 0.0339647755027) {
                    if (features[12] <= 6.79559469223) {
                        if (features[1] <= 0.00519052008167) {
                            classes[0] = 234; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 79; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 9; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[2] <= 0.0361120998859) {
                        if (features[15] <= -3.1231174469) {
                            classes[0] = 69; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 34; 
                            classes[1] = 245; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 5131.07617188) {
                            classes[0] = 120; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 31; 
                            classes[2] = 57; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[11] <= 48.4936256409) {
                    if (features[12] <= -7.0324640274) {
                        classes[0] = 0; 
                        classes[1] = 293; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[20] <= 0.32477581501) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 31; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[10] <= 0.139888495207) {
                        if (features[12] <= -5.64224052429) {
                            classes[0] = 3; 
                            classes[1] = 33; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 240; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[31] <= 0.343293130398) {
                            classes[0] = 38; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 58; 
                            classes[1] = 117; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                }
            }
        } else {
            if (features[24] <= 0.417131185532) {
                if (features[25] <= 0.593522906303) {
                    if (features[10] <= 3.2560133934) {
                        if (features[0] <= -0.586178898811) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 14; 
                            classes[3] = 1; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 105; 
                    }
                } else {
                    if (features[21] <= 0.242727652192) {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 4; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[13] <= 5.60318470001) {
                    if (features[32] <= 0.699297785759) {
                        if (features[10] <= 0.843536138535) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 413; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[4] <= 1.18850815296) {
                            classes[0] = 9; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[22] <= 0.348744660616) {
                        if (features[22] <= 0.312556803226) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 285; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_80(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.357850253582) {
            if (features[31] <= 0.535511791706) {
                if (features[16] <= 0.0393629148602) {
                    if (features[3] <= 0.00673207361251) {
                        if (features[4] <= 0.0146234482527) {
                            classes[0] = 321; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 28; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[24] <= 0.59967982769) {
                            classes[0] = 18; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[14] <= 5291.45410156) {
                        if (features[11] <= 1.38917732239) {
                            classes[0] = 4; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 237; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[0] <= -0.0320130884647) {
                            classes[0] = 5; 
                            classes[1] = 11; 
                            classes[2] = 21; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 18; 
                            classes[1] = 299; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[14] <= 3746.7421875) {
                    if (features[2] <= 0.333723008633) {
                        if (features[8] <= -0.187497869134) {
                            classes[0] = 3; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 146; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 2100.23828125) {
                            classes[0] = 2; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 26; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    }
                } else {
                    if (features[2] <= 0.0564826503396) {
                        if (features[27] <= 0.817850470543) {
                            classes[0] = 6; 
                            classes[1] = 362; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[4] <= 0.0855626091361) {
                            classes[0] = 3; 
                            classes[1] = 17; 
                            classes[2] = 47; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 54; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[11] <= -127.375511169) {
                if (features[25] <= 0.624365210533) {
                    if (features[26] <= 0.570336341858) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 75; 
                    } else {
                        if (features[26] <= 0.579981267452) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 9; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                }
            } else {
                if (features[7] <= 0.984436035156) {
                    if (features[10] <= 3.63503026962) {
                        if (features[15] <= 0.625974476337) {
                            classes[0] = 5; 
                            classes[1] = 11; 
                            classes[2] = 350; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[31] <= 0.718863666058) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 19; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[32] <= 0.512858211994) {
                        if (features[10] <= 3.8734023571) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 11; 
                            classes[3] = 15; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 12; 
                            classes[3] = 176; 
                        }
                    } else {
                        if (features[10] <= 3.69805288315) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 50; 
                            classes[3] = 17; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 96; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_81(double[] features) {
        int[] classes = new int[4];
        
        if (features[9] <= 4.59517145157) {
            if (features[1] <= 0.498605489731) {
                if (features[1] <= 0.00542031321675) {
                    if (features[16] <= 0.0370957627892) {
                        if (features[12] <= 5.28436851501) {
                            classes[0] = 191; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 15; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[16] <= 0.0524529218674) {
                            classes[0] = 0; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 8; 
                        }
                    }
                } else {
                    if (features[12] <= -6.49441432953) {
                        if (features[9] <= 1.25937390327) {
                            classes[0] = 14; 
                            classes[1] = 432; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 86; 
                            classes[2] = 54; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[15] <= -5.6795835495) {
                            classes[0] = 173; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 112; 
                            classes[1] = 202; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[8] <= -14.4917297363) {
                    if (features[16] <= 3.03336071968) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 26; 
                        classes[3] = 0; 
                    } else {
                        if (features[3] <= 1.62052607536) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 130; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    if (features[13] <= 5.925157547) {
                        if (features[2] <= 126.862091064) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 421; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 11; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[21] <= 0.4153021276) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 47; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 199; 
                        }
                    }
                }
            }
        } else {
            if (features[30] <= 0.645028471947) {
                if (features[12] <= -5.71399021149) {
                    if (features[28] <= 0.558010339737) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 10; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 350; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[4] <= 0.786705970764) {
                    if (features[9] <= 5.65284347534) {
                        if (features[4] <= 0.0250235013664) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 16; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 23; 
                    classes[3] = 0; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_82(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 1925.41503906) {
            if (features[5] <= 3.30120611191) {
                if (features[7] <= 0.38256201148) {
                    if (features[14] <= 4531.63427734) {
                        if (features[10] <= 0.176189288497) {
                            classes[0] = 95; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 13; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[15] <= -1.09700036049) {
                            classes[0] = 8; 
                            classes[1] = 112; 
                            classes[2] = 65; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 579; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[13] <= 5.86056995392) {
                        if (features[28] <= 0.728245198727) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 164; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 150; 
                    }
                }
            } else {
                if (features[1] <= 1.76522135735) {
                    if (features[13] <= 0.904796123505) {
                        if (features[6] <= -0.154133856297) {
                            classes[0] = 0; 
                            classes[1] = 24; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 24; 
                            classes[1] = 25; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[5] <= 131.203063965) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 237; 
                            classes[3] = 18; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 33; 
                            classes[3] = 35; 
                        }
                    }
                } else {
                    if (features[4] <= 1.35797929764) {
                        if (features[1] <= 2.13531446457) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[15] <= -4.37982177734) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 201; 
                        }
                    }
                }
            }
        } else {
            if (features[12] <= -6.26526927948) {
                if (features[7] <= 0.772041082382) {
                    classes[0] = 0; 
                    classes[1] = 15; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[3] <= -0.196106493473) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 2; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 2; 
                    }
                }
            } else {
                if (features[13] <= 3.58285617828) {
                    if (features[31] <= 0.882793068886) {
                        if (features[7] <= 0.010713422671) {
                            classes[0] = 418; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 297; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 5; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_83(double[] features) {
        int[] classes = new int[4];
        
        if (features[9] <= 4.66068410873) {
            if (features[17] <= 2029.92138672) {
                if (features[13] <= 1.30918955803) {
                    if (features[11] <= 101.222076416) {
                        if (features[4] <= 0.999966442585) {
                            classes[0] = 16; 
                            classes[1] = 492; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[10] <= 0.167257457972) {
                            classes[0] = 5; 
                            classes[1] = 130; 
                            classes[2] = 58; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 125; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[4] <= 1.75743293762) {
                        if (features[3] <= -0.961889743805) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 29; 
                            classes[3] = 22; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 4; 
                            classes[2] = 394; 
                            classes[3] = 28; 
                        }
                    } else {
                        if (features[10] <= 3.4738240242) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 26; 
                            classes[3] = 7; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 355; 
                        }
                    }
                }
            } else {
                if (features[16] <= 1.90772950649) {
                    if (features[6] <= -0.428438872099) {
                        classes[0] = 0; 
                        classes[1] = 6; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[18] <= 0.760289013386) {
                            classes[0] = 462; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 9; 
                }
            }
        } else {
            if (features[1] <= 0.70099490881) {
                if (features[26] <= 0.750770688057) {
                    if (features[30] <= 0.762364149094) {
                        if (features[30] <= 0.717192173004) {
                            classes[0] = 313; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 5.49705886841) {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[14] <= -1309.88134766) {
                        classes[0] = 0; 
                        classes[1] = 3; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[26] <= 0.765284240246) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 31; 
                classes[3] = 0; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_84(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 642.587646484) {
            if (features[4] <= 1.64927411079) {
                if (features[2] <= 3117.89013672) {
                    if (features[32] <= 0.919948160648) {
                        if (features[29] <= 0.272963643074) {
                            classes[0] = 5; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 822; 
                            classes[1] = 11; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[7] <= 0.168122664094) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 9; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 16; 
            }
        } else {
            if (features[7] <= 0.329145312309) {
                if (features[0] <= -0.0275279358029) {
                    if (features[14] <= 6404.19335938) {
                        if (features[26] <= 0.362373709679) {
                            classes[0] = 0; 
                            classes[1] = 17; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 5; 
                        }
                    } else {
                        if (features[26] <= 0.321144789457) {
                            classes[0] = 2; 
                            classes[1] = 6; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 69; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 0.0185845270753) {
                        if (features[9] <= 5.81260871887) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 16; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 660.710693359) {
                            classes[0] = 22; 
                            classes[1] = 674; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 16; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[10] <= 3.49267625809) {
                    if (features[14] <= 7453.9375) {
                        if (features[23] <= 0.0410418920219) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 5; 
                            classes[2] = 427; 
                            classes[3] = 5; 
                        }
                    } else {
                        if (features[3] <= -0.0298865586519) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 9; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[13] <= 5.01453828812) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 43; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 341; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_85(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.532843470573) {
            if (features[4] <= 0.00919142924249) {
                if (features[14] <= 3310.25073242) {
                    if (features[8] <= 11.9371337891) {
                        classes[0] = 376; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 3; 
                    }
                } else {
                    if (features[4] <= 0.00163973320741) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 4; 
                    } else {
                        if (features[2] <= 0.0718411430717) {
                            classes[0] = 2; 
                            classes[1] = 23; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 1; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[15] <= -3.93091821671) {
                    classes[0] = 299; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[0] <= -0.0286224521697) {
                        if (features[12] <= -10.0540981293) {
                            classes[0] = 2; 
                            classes[1] = 8; 
                            classes[2] = 52; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 70; 
                            classes[1] = 13; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= -5.53845834732) {
                            classes[0] = 9; 
                            classes[1] = 493; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 123; 
                            classes[1] = 205; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[16] <= 4.21037387848) {
                if (features[7] <= 1.0419305563) {
                    if (features[17] <= 2202.8828125) {
                        if (features[21] <= 0.219246953726) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 388; 
                            classes[3] = 3; 
                        }
                    } else {
                        classes[0] = 5; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[16] <= 3.02943181992) {
                        if (features[25] <= 0.403228759766) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 64; 
                            classes[3] = 6; 
                        }
                    } else {
                        if (features[13] <= 5.57984638214) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 12; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 47; 
                        }
                    }
                }
            } else {
                if (features[7] <= 0.838398814201) {
                    if (features[4] <= 1.81975221634) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 9; 
                        classes[3] = 0; 
                    } else {
                        if (features[32] <= 0.581126093864) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 16; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[13] <= 5.925157547) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 3; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 307; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_86(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.351465284824) {
            if (features[12] <= -6.3851647377) {
                if (features[5] <= 0.0165669210255) {
                    if (features[15] <= -1.11473369598) {
                        if (features[6] <= 0.00195369380526) {
                            classes[0] = 3; 
                            classes[1] = 13; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 59; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[7] <= 0.00751049397513) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 48; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[13] <= 5.06832504272) {
                        if (features[8] <= 0.0865532457829) {
                            classes[0] = 10; 
                            classes[1] = 15; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 463; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 4; 
                    }
                }
            } else {
                if (features[16] <= 0.0326427295804) {
                    if (features[8] <= 0.000397512194468) {
                        if (features[3] <= 0.0072788419202) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 5109.77783203) {
                            classes[0] = 483; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[17] <= 304.708007812) {
                        if (features[18] <= 0.241758704185) {
                            classes[0] = 4; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 28; 
                            classes[1] = 201; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[32] <= 0.943619966507) {
                            classes[0] = 336; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    }
                }
            }
        } else {
            if (features[7] <= 0.972985863686) {
                if (features[4] <= 0.596023499966) {
                    if (features[29] <= 0.671490728855) {
                        if (features[17] <= 571.238586426) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 4; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 16; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 7; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[16] <= 5.157579422) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 364; 
                        classes[3] = 0; 
                    } else {
                        if (features[13] <= 7.18752384186) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 18; 
                        }
                    }
                }
            } else {
                if (features[4] <= 1.75531148911) {
                    if (features[19] <= 0.178207218647) {
                        if (features[9] <= 2.02664422989) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 18; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 5.94364929199) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 78; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 24; 
                        }
                    }
                } else {
                    if (features[4] <= 1.87424647808) {
                        if (features[24] <= 0.571457505226) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 17; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[0] <= 2.61118078232) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 296; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_87(double[] features) {
        int[] classes = new int[4];
        
        if (features[12] <= -5.54223918915) {
            if (features[17] <= 28.720905304) {
                if (features[10] <= 1.25366473198) {
                    if (features[3] <= 0.00049904466141) {
                        classes[0] = 0; 
                        classes[1] = 361; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[15] <= -0.0144222192466) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 4.63024806976) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 69; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 44; 
                    }
                }
            } else {
                if (features[14] <= 5490.19091797) {
                    if (features[1] <= 0.825567185879) {
                        if (features[10] <= 2.85573983192) {
                            classes[0] = 0; 
                            classes[1] = 74; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[17] <= 84.22706604) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 52; 
                        }
                    }
                } else {
                    if (features[7] <= 0.325388967991) {
                        if (features[0] <= -0.0256232470274) {
                            classes[0] = 2; 
                            classes[1] = 10; 
                            classes[2] = 63; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 15; 
                            classes[1] = 95; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 7290.57714844) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 186; 
                            classes[3] = 36; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 33; 
                        }
                    }
                }
            }
        } else {
            if (features[13] <= 1.38631367683) {
                if (features[17] <= 380.399597168) {
                    if (features[14] <= 4821.35546875) {
                        if (features[18] <= 0.816138207912) {
                            classes[0] = 43; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 6235.04052734) {
                            classes[0] = 14; 
                            classes[1] = 195; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[4] <= 0.0277820192277) {
                        if (features[31] <= 0.810428619385) {
                            classes[0] = 622; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 0.0147057175636) {
                            classes[0] = 3; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 206; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[19] <= 0.14907681942) {
                    if (features[13] <= 5.60601139069) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 3; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 135; 
                    }
                } else {
                    if (features[22] <= 0.393853098154) {
                        if (features[13] <= 5.72001171112) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 84; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[5] <= 2.94781827927) {
                            classes[0] = 17; 
                            classes[1] = 0; 
                            classes[2] = 11; 
                            classes[3] = 39; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 56; 
                            classes[3] = 50; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_88(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1729.83325195) {
            if (features[8] <= -2.1631731987) {
                if (features[9] <= 3.89643001556) {
                    if (features[17] <= 1547.95275879) {
                        if (features[16] <= 2.30861616135) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 22; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 5; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 7; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[8] <= 5.34907102585) {
                    if (features[1] <= 1.21514344215) {
                        if (features[29] <= 0.707283616066) {
                            classes[0] = 809; 
                            classes[1] = 17; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 18; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 12; 
                    }
                } else {
                    if (features[7] <= 1.45706820488) {
                        if (features[26] <= 0.358166754246) {
                            classes[0] = 0; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 14; 
                            classes[1] = 2; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 10; 
                    }
                }
            }
        } else {
            if (features[10] <= 1.29073655605) {
                if (features[11] <= 45.5200958252) {
                    if (features[14] <= 6502.97460938) {
                        if (features[11] <= -5.66587400436) {
                            classes[0] = 6; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 410; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[2] <= 0.0317088961601) {
                            classes[0] = 7; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[2] <= 0.0564826503396) {
                        if (features[10] <= 1.2010320425) {
                            classes[0] = 15; 
                            classes[1] = 206; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[5] <= 0.0266628134996) {
                            classes[0] = 11; 
                            classes[1] = 21; 
                            classes[2] = 58; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 62; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[4] <= 1.83324885368) {
                    if (features[16] <= 4.93375968933) {
                        if (features[23] <= 0.0940373912454) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 12; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 7; 
                            classes[2] = 418; 
                            classes[3] = 18; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 16; 
                    }
                } else {
                    if (features[1] <= 1.54734587669) {
                        if (features[10] <= 3.87399196625) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 18; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 13; 
                        }
                    } else {
                        if (features[4] <= 5.65950298309) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 290; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_89(double[] features) {
        int[] classes = new int[4];
        
        if (features[16] <= 1.27057504654) {
            if (features[12] <= -6.04074192047) {
                if (features[11] <= 110.452957153) {
                    if (features[17] <= 52.3788528442) {
                        if (features[14] <= 6449.85009766) {
                            classes[0] = 0; 
                            classes[1] = 239; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 72; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 6501.53417969) {
                            classes[0] = 5; 
                            classes[1] = 71; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[12] <= -10.0962533951) {
                        if (features[8] <= 0.324453622103) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 66; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 27; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 90; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[14] <= 5216.22460938) {
                    if (features[8] <= -87.1409759521) {
                        if (features[7] <= 0.0249476656318) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= 8.30613613129) {
                            classes[0] = 843; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 16; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[7] <= 0.386159956455) {
                        if (features[15] <= 1.04774832726) {
                            classes[0] = 5; 
                            classes[1] = 213; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 12; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[1] <= 1.70754265785) {
                if (features[0] <= 0.372685968876) {
                    if (features[16] <= 4.30751514435) {
                        if (features[17] <= 2900.73779297) {
                            classes[0] = 4; 
                            classes[1] = 19; 
                            classes[2] = 439; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 20; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= -9.93488693237) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 38; 
                        }
                    }
                } else {
                    if (features[17] <= 1367.46557617) {
                        if (features[13] <= 4.76150846481) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 26; 
                        }
                    } else {
                        classes[0] = 1; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[16] <= 3.94174146652) {
                    if (features[7] <= 0.942665636539) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 11; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 32; 
                    }
                } else {
                    if (features[31] <= 0.227530032396) {
                        if (features[20] <= 0.593572974205) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 9; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[22] <= 0.336798995733) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 260; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_90(double[] features) {
        int[] classes = new int[4];
        
        if (features[10] <= 1.34102582932) {
            if (features[15] <= -2.92861223221) {
                if (features[16] <= 2.408005476) {
                    if (features[32] <= 0.181363016367) {
                        if (features[32] <= 0.130481511354) {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 568; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 1; 
                }
            } else {
                if (features[10] <= 0.032464787364) {
                    if (features[15] <= 0.932018995285) {
                        if (features[10] <= 0.0145076578483) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 39; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 79; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[2] <= 0.0480201169848) {
                        if (features[9] <= -2.99680900574) {
                            classes[0] = 9; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 20; 
                            classes[1] = 573; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 0.0393790900707) {
                            classes[0] = 149; 
                            classes[1] = 34; 
                            classes[2] = 57; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 40; 
                            classes[1] = 130; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[22] <= 0.444956362247) {
                if (features[11] <= 193.695495605) {
                    if (features[11] <= -167.237930298) {
                        if (features[0] <= -0.374792516232) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 18; 
                        }
                    } else {
                        if (features[1] <= 1.84869170189) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 225; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 17; 
                        }
                    }
                } else {
                    if (features[16] <= 3.37401723862) {
                        if (features[15] <= -3.05331492424) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 38; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[19] <= 0.758993268013) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 36; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 12; 
                        }
                    }
                }
            } else {
                if (features[4] <= 1.63466727734) {
                    if (features[17] <= 1763.91870117) {
                        if (features[1] <= 2.10975408554) {
                            classes[0] = 5; 
                            classes[1] = 1; 
                            classes[2] = 140; 
                            classes[3] = 21; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 12; 
                        }
                    } else {
                        classes[0] = 16; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[28] <= 0.593196153641) {
                        if (features[29] <= 0.611444175243) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 220; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 10; 
                        }
                    } else {
                        if (features[15] <= -1.05887842178) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 13; 
                            classes[3] = 11; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 10; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_91(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 1033.65795898) {
            if (features[7] <= 0.335940718651) {
                if (features[13] <= 0.0137783717364) {
                    if (features[14] <= 3537.76245117) {
                        classes[0] = 28; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 9; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[14] <= 4629.59765625) {
                        if (features[31] <= 0.594566464424) {
                            classes[0] = 31; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 11; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[0] <= -0.0320130884647) {
                            classes[0] = 3; 
                            classes[1] = 17; 
                            classes[2] = 59; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 29; 
                            classes[1] = 710; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[10] <= 3.49267625809) {
                    if (features[1] <= 0.513126134872) {
                        if (features[30] <= 0.509873628616) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 6.3945608139) {
                            classes[0] = 1; 
                            classes[1] = 5; 
                            classes[2] = 400; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 10; 
                        }
                    }
                } else {
                    if (features[31] <= 0.744284749031) {
                        if (features[16] <= 3.29185962677) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 37; 
                            classes[3] = 21; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 298; 
                        }
                    } else {
                        if (features[5] <= -48.4120330811) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[12] <= -5.93895483017) {
                if (features[4] <= 1.92429673672) {
                    if (features[16] <= 1.55257248878) {
                        classes[0] = 0; 
                        classes[1] = 19; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[2] <= -17.0065460205) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 22; 
                }
            } else {
                if (features[10] <= 4.12378978729) {
                    if (features[27] <= 0.169934809208) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 2; 
                    } else {
                        if (features[32] <= 0.934080481529) {
                            classes[0] = 791; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 4; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_92(double[] features) {
        int[] classes = new int[4];
        
        if (features[10] <= 1.34102582932) {
            if (features[31] <= 0.500133514404) {
                if (features[11] <= 97.8617019653) {
                    if (features[9] <= 0.101568304002) {
                        if (features[15] <= -6.39840936661) {
                            classes[0] = 13; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 16; 
                            classes[1] = 184; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[3] <= -0.107122436166) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 91; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[9] <= 3.70116496086) {
                        if (features[8] <= 0.0769942626357) {
                            classes[0] = 23; 
                            classes[1] = 35; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 197; 
                            classes[1] = 20; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 201; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[16] <= 0.0330856516957) {
                    if (features[11] <= 11.9100885391) {
                        if (features[15] <= -5.78188323975) {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[0] <= -0.0381977334619) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 95; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[11] <= 1627.26208496) {
                        if (features[12] <= -5.51469182968) {
                            classes[0] = 5; 
                            classes[1] = 373; 
                            classes[2] = 44; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 78; 
                            classes[1] = 141; 
                            classes[2] = 2; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[2] <= 3119.35864258) {
                            classes[0] = 69; 
                            classes[1] = 16; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[22] <= 0.459613859653) {
                if (features[1] <= 1.81824147701) {
                    if (features[30] <= 0.176488339901) {
                        if (features[1] <= 0.151398926973) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 5.925157547) {
                            classes[0] = 5; 
                            classes[1] = 3; 
                            classes[2] = 316; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 23; 
                        }
                    }
                } else {
                    if (features[13] <= 6.50438213348) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 6; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 98; 
                    }
                }
            } else {
                if (features[4] <= 1.75352239609) {
                    if (features[9] <= 6.87854146957) {
                        if (features[13] <= 5.60660171509) {
                            classes[0] = 4; 
                            classes[1] = 4; 
                            classes[2] = 122; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 35; 
                        }
                    } else {
                        classes[0] = 17; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[1] <= 1.72203803062) {
                        if (features[0] <= -0.259033501148) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 11; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 18; 
                            classes[3] = 15; 
                        }
                    } else {
                        if (features[23] <= 0.900397777557) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 238; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_93(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 1029.72302246) {
            if (features[13] <= 1.24531698227) {
                if (features[4] <= 0.0058935135603) {
                    if (features[1] <= 0.00310359383002) {
                        if (features[14] <= 3569.56762695) {
                            classes[0] = 25; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 5.73436975479) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[9] <= 6.87282180786) {
                        if (features[3] <= -0.00249310187064) {
                            classes[0] = 21; 
                            classes[1] = 569; 
                            classes[2] = 13; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 135; 
                            classes[2] = 51; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 35; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[13] <= 5.925157547) {
                    if (features[25] <= 0.254122704268) {
                        classes[0] = 3; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[11] <= 4478.04492188) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 500; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[15] <= -4.37982177734) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 2; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 376; 
                    }
                }
            }
        } else {
            if (features[1] <= 0.771307945251) {
                if (features[2] <= 3119.35864258) {
                    if (features[11] <= -4.86642408371) {
                        if (features[10] <= 0.426428049803) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 3.67255163193) {
                            classes[0] = 748; 
                            classes[1] = 11; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 8; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[13] <= 5.93625402451) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 6; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 31; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_94(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 1.31792593002) {
            if (features[15] <= -2.90195298195) {
                classes[0] = 615; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                if (features[14] <= 4202.59472656) {
                    if (features[5] <= 67.2359466553) {
                        if (features[31] <= 0.882764935493) {
                            classes[0] = 238; 
                            classes[1] = 11; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[32] <= 0.23152308166) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 17; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[15] <= -0.987950205803) {
                        if (features[7] <= 0.0157613381743) {
                            classes[0] = 7; 
                            classes[1] = 30; 
                            classes[2] = 50; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 118; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 7.21023797989) {
                            classes[0] = 7; 
                            classes[1] = 565; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[10] <= 3.48949098587) {
                if (features[30] <= 0.758935213089) {
                    if (features[14] <= 3603.06762695) {
                        if (features[13] <= 3.22658014297) {
                            classes[0] = 11; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[1] <= 1.93811953068) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 378; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 6; 
                        }
                    }
                } else {
                    if (features[13] <= 2.82884883881) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 3; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[9] <= 2.61542320251) {
                    if (features[29] <= 0.658080756664) {
                        if (features[28] <= 0.597740709782) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 346; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 41; 
                        }
                    } else {
                        if (features[16] <= 4.23863172531) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 8; 
                        }
                    }
                } else {
                    if (features[4] <= 1.84983789921) {
                        if (features[3] <= -0.581609129906) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 10; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 30; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[16] <= 4.06056547165) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 17; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_95(double[] features) {
        int[] classes = new int[4];
        
        if (features[10] <= 1.31687831879) {
            if (features[4] <= 0.011982453987) {
                if (features[12] <= -5.65289115906) {
                    if (features[19] <= 0.572800517082) {
                        if (features[0] <= -0.0294696148485) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 51; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[11] <= 78.2026672363) {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 9; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[31] <= 0.189288794994) {
                        if (features[11] <= 1140.53637695) {
                            classes[0] = 1; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= -0.264108002186) {
                            classes[0] = 80; 
                            classes[1] = 15; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 377; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[13] <= 0.0357916690409) {
                    if (features[11] <= 1558.62182617) {
                        if (features[17] <= 3334.0546875) {
                            classes[0] = 1; 
                            classes[1] = 248; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[22] <= 0.638996839523) {
                            classes[0] = 9; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 0.0821839272976) {
                        if (features[12] <= -5.98844909668) {
                            classes[0] = 3; 
                            classes[1] = 21; 
                            classes[2] = 24; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 179; 
                            classes[1] = 15; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= -6.00961208344) {
                            classes[0] = 5; 
                            classes[1] = 291; 
                            classes[2] = 30; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 154; 
                            classes[1] = 109; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[16] <= 3.80778074265) {
                if (features[13] <= 5.57911300659) {
                    if (features[14] <= 233.464111328) {
                        classes[0] = 32; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[15] <= 3.99205112457) {
                            classes[0] = 1; 
                            classes[1] = 5; 
                            classes[2] = 424; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 47; 
                }
            } else {
                if (features[12] <= -10.03033638) {
                    if (features[21] <= 0.451309978962) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 1; 
                    } else {
                        if (features[13] <= 7.08839130402) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 25; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    if (features[15] <= 2.92151522636) {
                        if (features[10] <= 2.92524862289) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 357; 
                        }
                    } else {
                        classes[0] = 2; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_96(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1729.83325195) {
            if (features[2] <= 5.84975528717) {
                if (features[12] <= 7.54663276672) {
                    if (features[4] <= 1.17942249775) {
                        if (features[14] <= -79.9946899414) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 813; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[16] <= 3.72273206711) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 5; 
                        }
                    }
                } else {
                    if (features[2] <= -9.96441650391) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 8; 
                    } else {
                        if (features[3] <= 0.239069327712) {
                            classes[0] = 0; 
                            classes[1] = 11; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                }
            } else {
                if (features[11] <= 902.926391602) {
                    if (features[13] <= 4.03819274902) {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 18; 
                    }
                } else {
                    if (features[23] <= 0.172238320112) {
                        if (features[12] <= -6.79026985168) {
                            classes[0] = 0; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 12; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[19] <= 0.0944434553385) {
                if (features[5] <= 2979.00830078) {
                    if (features[19] <= 0.0322645120323) {
                        if (features[32] <= 0.453732609749) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[20] <= 0.401450961828) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 2; 
                            classes[3] = 109; 
                        }
                    }
                } else {
                    if (features[18] <= 0.459269404411) {
                        classes[0] = 0; 
                        classes[1] = 5; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[13] <= 1.30918955803) {
                    if (features[3] <= -0.0463330075145) {
                        if (features[5] <= 30.5759010315) {
                            classes[0] = 3; 
                            classes[1] = 465; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 10; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 0.788675665855) {
                            classes[0] = 20; 
                            classes[1] = 198; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 18; 
                            classes[1] = 107; 
                            classes[2] = 59; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 4.63542222977) {
                        if (features[4] <= 2.00202798843) {
                            classes[0] = 3; 
                            classes[1] = 1; 
                            classes[2] = 416; 
                            classes[3] = 22; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 16; 
                        }
                    } else {
                        if (features[13] <= 4.89292144775) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 188; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_97(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 1.38631367683) {
            if (features[31] <= 0.508131742477) {
                if (features[1] <= 0.00550102442503) {
                    if (features[27] <= 0.643634498119) {
                        if (features[4] <= 0.0171422362328) {
                            classes[0] = 265; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 2954.25878906) {
                            classes[0] = 7; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[12] <= -6.28058958054) {
                        if (features[1] <= 0.978786230087) {
                            classes[0] = 7; 
                            classes[1] = 206; 
                            classes[2] = 10; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= 8.32663440704) {
                            classes[0] = 338; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 59; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[14] <= 4202.59472656) {
                    if (features[23] <= 0.109841555357) {
                        if (features[16] <= 0.248067870736) {
                            classes[0] = 0; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[5] <= -0.153602689505) {
                            classes[0] = 10; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 209; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[7] <= 0.0189588591456) {
                        if (features[11] <= 31.98878479) {
                            classes[0] = 1; 
                            classes[1] = 195; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 92; 
                            classes[2] = 54; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[15] <= -6.37764501572) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 210; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[13] <= 5.70870304108) {
                if (features[1] <= 0.507479906082) {
                    if (features[19] <= 0.474002897739) {
                        if (features[11] <= 67.9593963623) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[16] <= 2.72115564346) {
                            classes[0] = 12; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    }
                } else {
                    if (features[32] <= 0.708106994629) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 428; 
                        classes[3] = 0; 
                    } else {
                        if (features[7] <= 0.572517454624) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[4] <= 1.32495296001) {
                    if (features[15] <= -2.32086515427) {
                        if (features[31] <= 0.599130272865) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 16; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 370; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_98(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.503835439682) {
            if (features[15] <= -2.93919610977) {
                if (features[14] <= 6329.5) {
                    classes[0] = 600; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[8] <= 12.1118173599) {
                        classes[0] = 0; 
                        classes[1] = 3; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 2; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[12] <= -5.71960544586) {
                    if (features[2] <= 0.0587311685085) {
                        if (features[8] <= 0.0887470245361) {
                            classes[0] = 16; 
                            classes[1] = 21; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 395; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 0.030754936859) {
                            classes[0] = 0; 
                            classes[1] = 18; 
                            classes[2] = 63; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 93; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[9] <= 4.14007329941) {
                        if (features[12] <= 5.12307357788) {
                            classes[0] = 176; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 226; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 89; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[0] <= 0.0654504746199) {
                if (features[2] <= -106.755912781) {
                    if (features[1] <= 1.75238156319) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 3; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 40; 
                    }
                } else {
                    if (features[10] <= 3.98011350632) {
                        if (features[13] <= 5.40313529968) {
                            classes[0] = 2; 
                            classes[1] = 3; 
                            classes[2] = 361; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 17; 
                        }
                    } else {
                        if (features[12] <= 9.46388053894) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 122; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 1; 
                        }
                    }
                }
            } else {
                if (features[10] <= 3.49932742119) {
                    if (features[8] <= 86.2473297119) {
                        if (features[26] <= 0.788674890995) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 92; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 4; 
                    }
                } else {
                    if (features[11] <= 1765.54492188) {
                        if (features[7] <= 0.83624714613) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 175; 
                        }
                    } else {
                        if (features[11] <= 4056.27539062) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_99(double[] features) {
        int[] classes = new int[4];
        
        if (features[15] <= -2.95896720886) {
            if (features[1] <= 0.815329432487) {
                if (features[14] <= 6329.5) {
                    classes[0] = 552; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[4] <= 0.100832387805) {
                        classes[0] = 7; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[29] <= 0.624074101448) {
                    if (features[10] <= 3.61678934097) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 19; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[4] <= 0.655030488968) {
                if (features[17] <= 2034.67883301) {
                    if (features[14] <= 4350.85449219) {
                        if (features[5] <= 93.9960632324) {
                            classes[0] = 46; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 5; 
                        }
                    } else {
                        if (features[15] <= -1.0681655407) {
                            classes[0] = 8; 
                            classes[1] = 124; 
                            classes[2] = 70; 
                            classes[3] = 17; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 581; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[18] <= 0.805871367455) {
                        if (features[2] <= 8.59199428558) {
                            classes[0] = 241; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 7; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[27] <= 0.510096311569) {
                    if (features[17] <= -102.682556152) {
                        if (features[1] <= 1.52935266495) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 68; 
                        }
                    } else {
                        if (features[17] <= 501.461120605) {
                            classes[0] = 2; 
                            classes[1] = 4; 
                            classes[2] = 208; 
                            classes[3] = 130; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 11; 
                            classes[3] = 83; 
                        }
                    }
                } else {
                    if (features[10] <= 3.46940326691) {
                        if (features[17] <= 1274.39575195) {
                            classes[0] = 3; 
                            classes[1] = 15; 
                            classes[2] = 212; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[15] <= -0.263561695814) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 80; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 21; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict(double[] features) {
        int n_classes = 4;
        int[] classes = new int[n_classes];
        classes[RandomForestClassifier.predict_0(features)]++;
        classes[RandomForestClassifier.predict_1(features)]++;
        classes[RandomForestClassifier.predict_2(features)]++;
        classes[RandomForestClassifier.predict_3(features)]++;
        classes[RandomForestClassifier.predict_4(features)]++;
        classes[RandomForestClassifier.predict_5(features)]++;
        classes[RandomForestClassifier.predict_6(features)]++;
        classes[RandomForestClassifier.predict_7(features)]++;
        classes[RandomForestClassifier.predict_8(features)]++;
        classes[RandomForestClassifier.predict_9(features)]++;
        classes[RandomForestClassifier.predict_10(features)]++;
        classes[RandomForestClassifier.predict_11(features)]++;
        classes[RandomForestClassifier.predict_12(features)]++;
        classes[RandomForestClassifier.predict_13(features)]++;
        classes[RandomForestClassifier.predict_14(features)]++;
        classes[RandomForestClassifier.predict_15(features)]++;
        classes[RandomForestClassifier.predict_16(features)]++;
        classes[RandomForestClassifier.predict_17(features)]++;
        classes[RandomForestClassifier.predict_18(features)]++;
        classes[RandomForestClassifier.predict_19(features)]++;
        classes[RandomForestClassifier.predict_20(features)]++;
        classes[RandomForestClassifier.predict_21(features)]++;
        classes[RandomForestClassifier.predict_22(features)]++;
        classes[RandomForestClassifier.predict_23(features)]++;
        classes[RandomForestClassifier.predict_24(features)]++;
        classes[RandomForestClassifier.predict_25(features)]++;
        classes[RandomForestClassifier.predict_26(features)]++;
        classes[RandomForestClassifier.predict_27(features)]++;
        classes[RandomForestClassifier.predict_28(features)]++;
        classes[RandomForestClassifier.predict_29(features)]++;
        classes[RandomForestClassifier.predict_30(features)]++;
        classes[RandomForestClassifier.predict_31(features)]++;
        classes[RandomForestClassifier.predict_32(features)]++;
        classes[RandomForestClassifier.predict_33(features)]++;
        classes[RandomForestClassifier.predict_34(features)]++;
        classes[RandomForestClassifier.predict_35(features)]++;
        classes[RandomForestClassifier.predict_36(features)]++;
        classes[RandomForestClassifier.predict_37(features)]++;
        classes[RandomForestClassifier.predict_38(features)]++;
        classes[RandomForestClassifier.predict_39(features)]++;
        classes[RandomForestClassifier.predict_40(features)]++;
        classes[RandomForestClassifier.predict_41(features)]++;
        classes[RandomForestClassifier.predict_42(features)]++;
        classes[RandomForestClassifier.predict_43(features)]++;
        classes[RandomForestClassifier.predict_44(features)]++;
        classes[RandomForestClassifier.predict_45(features)]++;
        classes[RandomForestClassifier.predict_46(features)]++;
        classes[RandomForestClassifier.predict_47(features)]++;
        classes[RandomForestClassifier.predict_48(features)]++;
        classes[RandomForestClassifier.predict_49(features)]++;
        classes[RandomForestClassifier.predict_50(features)]++;
        classes[RandomForestClassifier.predict_51(features)]++;
        classes[RandomForestClassifier.predict_52(features)]++;
        classes[RandomForestClassifier.predict_53(features)]++;
        classes[RandomForestClassifier.predict_54(features)]++;
        classes[RandomForestClassifier.predict_55(features)]++;
        classes[RandomForestClassifier.predict_56(features)]++;
        classes[RandomForestClassifier.predict_57(features)]++;
        classes[RandomForestClassifier.predict_58(features)]++;
        classes[RandomForestClassifier.predict_59(features)]++;
        classes[RandomForestClassifier.predict_60(features)]++;
        classes[RandomForestClassifier.predict_61(features)]++;
        classes[RandomForestClassifier.predict_62(features)]++;
        classes[RandomForestClassifier.predict_63(features)]++;
        classes[RandomForestClassifier.predict_64(features)]++;
        classes[RandomForestClassifier.predict_65(features)]++;
        classes[RandomForestClassifier.predict_66(features)]++;
        classes[RandomForestClassifier.predict_67(features)]++;
        classes[RandomForestClassifier.predict_68(features)]++;
        classes[RandomForestClassifier.predict_69(features)]++;
        classes[RandomForestClassifier.predict_70(features)]++;
        classes[RandomForestClassifier.predict_71(features)]++;
        classes[RandomForestClassifier.predict_72(features)]++;
        classes[RandomForestClassifier.predict_73(features)]++;
        classes[RandomForestClassifier.predict_74(features)]++;
        classes[RandomForestClassifier.predict_75(features)]++;
        classes[RandomForestClassifier.predict_76(features)]++;
        classes[RandomForestClassifier.predict_77(features)]++;
        classes[RandomForestClassifier.predict_78(features)]++;
        classes[RandomForestClassifier.predict_79(features)]++;
        classes[RandomForestClassifier.predict_80(features)]++;
        classes[RandomForestClassifier.predict_81(features)]++;
        classes[RandomForestClassifier.predict_82(features)]++;
        classes[RandomForestClassifier.predict_83(features)]++;
        classes[RandomForestClassifier.predict_84(features)]++;
        classes[RandomForestClassifier.predict_85(features)]++;
        classes[RandomForestClassifier.predict_86(features)]++;
        classes[RandomForestClassifier.predict_87(features)]++;
        classes[RandomForestClassifier.predict_88(features)]++;
        classes[RandomForestClassifier.predict_89(features)]++;
        classes[RandomForestClassifier.predict_90(features)]++;
        classes[RandomForestClassifier.predict_91(features)]++;
        classes[RandomForestClassifier.predict_92(features)]++;
        classes[RandomForestClassifier.predict_93(features)]++;
        classes[RandomForestClassifier.predict_94(features)]++;
        classes[RandomForestClassifier.predict_95(features)]++;
        classes[RandomForestClassifier.predict_96(features)]++;
        classes[RandomForestClassifier.predict_97(features)]++;
        classes[RandomForestClassifier.predict_98(features)]++;
        classes[RandomForestClassifier.predict_99(features)]++;
    
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < n_classes; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static void main(String[] args) {
        if (args.length == 33) {

            // Features:
            double[] features = new double[args.length];
            for (int i = 0, l = args.length; i < l; i++) {
                features[i] = Double.parseDouble(args[i]);
            }

            // Prediction:
            int prediction = RandomForestClassifier.predict(features);
            System.out.println(prediction);

        }
    }
}q .
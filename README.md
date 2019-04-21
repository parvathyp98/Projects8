# Android Mobile App with Handwriting Recognition

Handwritten Text Recognition system trained on the IAM off-line HTR dataset. This Neural Network (NN) model recognizes the text contained in the images of segmented words as shown in the illustration below. As these word-images are smaller than images of complete text-lines, the NN can be kept small and training on the CPU is feasible. 3/4 of the words from the validation-set are correctly recognized and the character error rate is around 10%.

![htr](htr.png)

# Run Demo

 run python main.py. The input image and the expected output is shown below.
 
 ![htr](test.png)
 ```
 > python main.py
Validation character error rate of saved model: 10.624916%
Recognized: "little"
Probability: 0.96625507
```

Tested with: 
* Python 3
* TF 1.12
* Ubuntu 14.04

# Command line arguments

* --train: train the NN
* --validate: validate the NN

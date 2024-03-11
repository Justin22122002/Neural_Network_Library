# Convolutional Neural Network Tutorial
## Project Overview:
Welcome to the Convolutional Neural Network (CNN) Maven library in Java! 
This repository provides a foundation for understanding and implementing CNNs from scratch. 
Stay tuned for the addition of other neural network architectures.

This project is designed to be a self-contained Maven project and 
does not rely on external libraries. 
It serves as an educational resource for those interested in learning the intricacies of CNNs.

## Prerequisites:
Before diving into the code, make sure you have Java and Maven installed on your system. 
Execute the following command to install dependencies and build the project

```mvn clean install```

## Getting Started:
1. Clone the Repository:

    Clone this repository to your local machine using the following command:
    ``` git clone <repository_url>```
2. Explore the Code:

    Navigate to the ```src/main/java/org/justin/``` directory to find the main Java files (Main.java, NetworkBuilder.java, etc.).
    Open and explore the Main.java file, which serves as the entry point for your experiments.
3. Understand the CNN Architecture:

    The NetworkBuilder class provides a convenient way to define the architecture of your CNN. Experiment with different layer configurations in Main.java to see how they impact the network's performance.

4. Load the MNIST Dataset:

    The project includes a simple data loader **(DataReader.java)** for loading the MNIST dataset. 
    Check the paths in **Main.java** to ensure they match the location of your dataset. 
    The data sets are not included in this repo, download the MNIST dataset from:  https://pjreddie.com/projects/mnist-in-csv/  

5. Train and Test the CNN:

    Train the CNN by running the Main class. Observe the success rate on the test set after each training epoch.
package org.justin;

import org.justin.data.DataReader;
import org.justin.data.Image;
import org.justin.network.NetworkBuilder;
import org.justin.network.NeuralNetwork;

import java.util.List;

import static java.util.Collections.shuffle;

public class Main
{
    public static void main(String[] args)
    {
        long SEED = 123;

        System.out.println("Starting data loading...");

        // Load MNIST dataset for testing and training
        List<Image> imagesTest = new DataReader().readData("data/mnist_test.csv");
        List<Image> imagesTrain = new DataReader().readData("data/mnist_train.csv");

        System.out.println("Images Train size: " + imagesTrain.size());
        System.out.println("Images Test size: " + imagesTest.size());

        // Build the neural network architecture
        NetworkBuilder builder = new NetworkBuilder(28, 28, 256 * 100);
        builder.addConvolutionLayer(8, 5, 1, 0.1, SEED);
        builder.addMaxPoolLayer(3, 2);
        builder.addFullyConnectedLayer(10, 0.1, SEED);

        // Create the neural network
        NeuralNetwork net = builder.build();

        // Evaluate the performance of the untrained network on the test data
        float rate = net.test(imagesTest);
        System.out.println("Pre-training success rate: " + rate);

        int epochs = 3;

        // Train the network for a specified number of epochs
        for (int i = 0; i < epochs; i++)
        {
            shuffle(imagesTrain); // Shuffle training data for each epoch
            net.train(imagesTrain); // Train the network
            rate = net.test(imagesTest); // Evaluate performance on test data
            System.out.println("Success rate after round " + i + ": " + rate);
        }
    }
}

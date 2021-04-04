# Assignment 1

You are required to develop a Java program with a graphical user interface (GUI) to render 2D objects based on user input, visualise some transitions between states and demonstrate how you’ve preserved states between transitions. You must use the same development environment as the one used in this module (Java 11 and JavaFX) to implement the logic and GUI components.

The program should have the following functionality:

1. [Component 1] An interactive component which has the following actions associated to it; the component can accept user input, where assuming the input is valid, a shape will be displayed on the main screen. It is assumed that the program will eventually support a large variety of shapes. The program should currently accept the following shapes as input: circle, rectangle, octagon.

   - You need to ensure that the user input is validated, and feedback is given when invalid input is entered.
   - The program should only allow the user to enter one valid shape at a time.
   - The main screen should only display one shape at a time.

2. [Component 2] An interactive component which has the following actions associated to it; the component must accept user input, where assuming the input is valid, the currently displayed shape will be filled using the colour of the valid input. Again, it is assumed that the program will eventually support a large variety of colours. The program should currently accept the following colours as input: blue, green, yellow.

   - You need to ensure that the user input is validated, and feedback is given when invalid input is entered.
   - The program should only allow the user to enter one valid colour at a time.
   - The currently displayed shape should only be filled with one colour at a time.

3. Any potential error states should not crash the program or generate generic error messages. The program should clearly indicate to the user that an error has occurred, with specific information on why the error occurred and what valid action(s) are available.

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).

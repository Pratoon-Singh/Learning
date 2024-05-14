Welcome back!

Let's now, jump right in.

One of the first things that you'd need to understand is, functional programming is a paradigm shift.

What do I mean by a paradigm shift?

It means that you would need to change how you'd think about problem-solving,

to master functional programming. And we are here to help you make that transition. In this course,

we'll take a step-by-step approach to introduce functional programming to you.

In this first section, we start with two key objectives.

Number one, is to help you understand how functional programming is different.

Number two, is to help you understand a few basic functional programming concepts.

We'll talk about Streams,

we will talk about Lambda Expressions, and we will talk about something called Method References.

As usual, we'll take a very very hands-on approach towards learning functional programming.

We'll write a few examples in traditional approach,

and look at, how you can write similar code in functional programming.

Let's quickly get started.

Creating a new project and starting to write some code. I'm going to create a new project.

I have Eclipse open.

I've already chosen a workspace.

I would want to create a new project.

So, let's go ahead and create a new Java Project, that's what we'd want to create.

File new, Java Project, and let's give the project a name.

I'll just call this, functional-programming-with-java. As you can see in here, I'm using Java 9.

Any version of Java greater than 9, is cool. So, Java 9, 10, 11,12; the code which we write in

this course is compatible with all the versions. That's the only thing you'd need to do.

And after that you can say, Finish.

Now, the project is created for us.

We have a source folder, where we can write our source code.

Let's get started with creating our first example.

The first problem that we would want to solve is, we would want to print a set of numbers.

So, we'll have a list of numbers, and we would want to actually print

each element in that list, one by one on a separate line.

Now, how do we do that in a traditional approach?

Let's quickly look at it.

I'll Create a new Java class. So, I'll say, new class and I would want to give it a name of, FP01.

So, we would use Functional Programming 01, is where we are in right now and I'll class this, Structured.

So, FP Structured, is the name of the class and the package name I would give it as, programming.

Let's add in a main method and let's click, Finish.

This would create the class for us with the main method, which is present in here, and over here I can

write all the code that we would want.

So, what do we want to do? We would want to write a method to printAllNumbersInList.

And which approach do you want to use?

We'd want to use a Structured approach, which is the traditional programming approach. Structured approach.

What do we want to print?

We'd want to print, a list of numbers.

How do we create a list of numbers?

I can say, List.of. Let's enter a sequence of numbers.

This can be random numbers.

So, let's enter 12, 9, 13, 4, 6, 2, 4,.

Let's have a few duplicates as well, so 12, 15.

Let's have a set of numbers in here.

Now, it's first giving me a compilation errors on the list.

Why?

Because I've not really imported it in. So, I would want to use java.util.List;

So, over here you can see that it's now imported in, java.util.List.

I just needed to do Ctrl 1 or Command 1,

and take the option to import, java.util.List.

Aha! The method does not really exist right?

Let's try and create the method right now. Ctrl 1 or Command 1,

and it says, create the method. Please do create the method for me. Cool! The method is now created for

us. You can say it's private static void printAllNumbersInListStructured, and I'll want to give a

name over here. I would want to call this, numbers. And I'll remove this line Ctrl D, Command D; and over here I'd

want to print all the numbers in the list. Now, you can write the program by yourself. How do you write

it? The first thing that we'd need to think about is, how to loop the numbers?

That's the traditional approach, right? So, we would want to first figure out, how do you loop all the numbers.

And once you decide how to loop, you can take each of the individual numbers and print it.

So, we'll first choose between, okay

should I use a traditional For loop or should I go for enhanced For loop?

Let's use the enhanced For loop. I'll say, for int number in numbers.

What do you want to do?

We'd want to print them out. So, sysout, and number.

Is that what we'd want to loop?

So, we'd want to print all the numbers in lists, in a structured way.

All that we needed to do was to loop the list of numbers and print them out.

Let's run this and see what would happen.

Right click, Run As, Java Application. Cool!

You can see that everything is now printed out to the console.

As you can see in here in the traditional approach,

whenever we would want to solve a problem, we focus on the how.

The first thing we needed to do was, okay,

I have a list of numbers.

How do I loop around them?

Okay, I'll use a For loop.

That's the first thing that we did, when we were talking about the Structured approach.

Now, how do we solve the same thing in a functional approach?

I'll keep you guessing.

Let's see that in the next step.

Until then bye-bye.



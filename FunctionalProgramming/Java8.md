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


Welcome back!

In the previous step, we solved the simple problem in a structured approach, and in this step we would

want to focus on how to solve it in a functional approach.

What I'll do is, I'll copy this file and paste it down here. I'll rename it to, FP01Functional.

Let's open up FP01Functional and that's where we'll try and solve this problem.

Let's start with renaming the method.

Right click, Refactor, Rename, and I would want to rename this to

printAllNumbersInList, in a Functional approach. That's what we would want to do.

So, we'd want to print all the numbers in a Functional approach.

We have a list of numbers passed in.

Now, how do we do this in a Functional approach?

One of the important things to remember is, in the functional approach, we will focus on, 'What to do?'

Before we can focus on what to do,

what we'd need to do is, we'd need to convert the list of numbers into a stream of numbers.

What does that mean?

You can see, that the list of numbers is this. You'd want to convert this into a stream.

So, I would want to convert it into a sequence of elements.

I would want to first get 12, then get 9, then get 13, then get 4,

and so on and so forth.

So, we would want to convert whatever we have, into a stream of elements.

How do we convert a list into a stream?

The way we can do that is by; let's comment out this piece of code, Ctrl slash or Command slash,

and followed by Ctrl Shift F or Command Shift F to format it. Cool! That's commented out.

We'd want to create a stream for numbers. So, numbers.stream.

As you can see in the Java doc, it says, "Returns a sequential Stream with this collection as its source."

So, we're taking a list and converting it into a stream of numbers.

So, we are converting it into individual numbers, which come one after the other;

a sequence of numbers: 12, 9, 13, 4. Once I have a stream of numbers,

what I can do is to specify, what to do with each one of them.

So when I get 12, what needs to be done? When I get 9, what needs to be done?

What do we want to do with each one of them?

We'd want to do a System.out.println(number) right?

So what we'll do is, we'll create a simple method, which accepts a parameter and prints it out.

So, let's create a simple method in here.

So, I call this private static void.

I'll just call this, print and let's send

in a int number to it.

What this will do is, it will just do a System.out.println(number).

So, it just prints a single number, that's it.

Nothing more, nothing less.

Now, what do we want to do over here?

numbers.stream() for each number. For each of these numbers, for 12, for 9, for 13, for 4,

we would want to call the print method.

How do we call the print method from here,

for each of the numbers? The way we can do that is by

saying, forEach, and you can define;

I would want to call the print method. Now, over here,

typically what we'd do, we'll say print of 5.

Alright! So, typically what would happen?

This code would be immediately executed.

We don't want the method to be immediately called. What we would want

to do is to define, what needs to be done.

We need to define the behavior, when we get a number of 12.

To define the behavior, we use something called a method reference.

How do you put a method reference in?

What we want to do is, for each element we'd want to call this print method.

How do we say that? The way we can say that is by using, the name of the class, colon,

colon, followed by the name of the method.

So, you can see that this is a static method and I'm using the class name colon, colon the name of the

static method. And what I'm telling it is, hey! take the numbers, convert in into a stream,

and for each element; for 12 do a print, for 9 do a print.

That's basically, what we are specifying in here.

Now, I think we have got almost everything covered. So let's do Right click, Run As, Java Application.

Aha! The output does not really change.

You can see that, everything is being printed out in a sequence.

Let's end this step by reviewing quickly, what's happening with this code.

What we are doing is, we are converting the numbers list into a stream.

So instead of getting a list like this, what we'll get is, a stream of elements like this.

And what we are specifying is, for each of these elements which are coming out, what we would want to

do is, to call the print method which is present in the current class.

And the syntax which we are using in here is, colon, colon.

This is the syntax of something called a Method Reference.

What we are saying in here is, for each element, this method needs to be called.

So, for each of the numbers coming up, what would happen is, this print method would get executed

and that's how we were seeing all the elements that are printed.

I'm sure there are a lot of questions about this specific approach.

Hold onto them, and I'll see you in the next step.

Welcome back.

In the last two steps, we implemented a simple problem in a structured approach and the functional approach

and you might be thinking now that the functional approach is much more complex than this structured

approach.

And that's true with the implementation that we have right now.

Let's see what we can do to simplify the implementation that we have.

So, let's first remove all this stuff that we have in here.

So, let's actually remove the earlier code that we have inside the functional method.

I'm using Ctrl D or command D to remove a line and now let's see the need for this specific print method.

What we are doing in here is, we would want to call FP Functional colon colon print.

We would want to call a static method in this specific class.

And what happens is, for each element in this stream, this static method is called with that element.

So, this stream contains a list of numbers.

So, first 12 is sent to this method,

next nine is sent to this method,

next 13 is sent to this method and we saw everything is printed out to the console.

That's cool.

Now, instead of doing this, you can actually replace this piece of code by directly specifying System.out

in here.

So, System.out and what is this static method? println.

So, System.out contains a static method called println and that's a easier way of doing it. Instead

of creating a new method called print,

what we can do is, directly call System.out::println.

And now, this method is no longer needed.

So, let's comment it out.

Now, you can see that this piece of code is a little more simpler than the structured approach.

Why do I call it simpler?

Because in this Structured approach, we had to focus on how to loop the numbers and then print them. In

the Functional approach,

on the other hand, we get a list of elements and we define what to do with each one of them.

So, all that we needed to do is to say for each element in this stream, do this. Now,

let's try and make the example that we have little bit more complex.

What I want to do is, I would want to go to the FP Structured class and what I would want to do is to

print only the even numbers.

I don't want to print all the numbers in the list but I only want to print the even numbers in the list.

So, instead of saying print all numbers in the list,

I only want to say print even numbers in the list structured.

How do we change this code to print even numbers in the list?

Think about it.

Typically, what we do is, we would add the logic in here. So, we'll say, if this is even, only then print

the number out, right?

So, let's do that.

So, if even,

how can I check that the number is even? If(number), we can divide

by two. So number%2==0.

So, we are dividing by two and checking the remainder. So, number%2 divides the number by two and checks

the remainder.

If it's zero, then what do we want to do? Yes, we would want to print the number out.

So, let's format this out.

And now, if I call this, so printEvenNumbersInListStructured, I can copy and paste this in but then

I would be repeating the list.

I don't really want to do that.

So, what we'll do is, let's extract this list to a local variable. So, right-click, List factor, extract to

a local variable and local variable that I would want to create is numbers and over here, what we want

to do is, we would want to print all the even numbers in the list. Right.

So, that's basically what we want to do.

So we are using the Structured approach and let's run as Java Application. What would happen? Cool. Only the even

numbers are getting printed.

Now how do we do the same thing in a Functional approach?

How do I do that in a FP01functional class? Let's see how to do that right now.

So, I'll copy the existing method. As usual,

I'll call this printEvenNumbersInListFunctional and over here,

what we want to do is, we'd want to only look at the numbers which are even. So how do I add additional logic

in here. I can add a Filter in here. I'll say, only allow even numbers.

How can I add a Filter? The way I can do that is by saying .filter.

Now, how do I decide if something is even? Let's create a static method for it, for now. I'll call this private

static, this return whether it's even or not. So I'll say boolean, private static boolean isEven

and let's pass the number to it.

So, int number and this would return.

What does it return?

number%2

is equal to, is equal to zero.

This is simple logic. Right?

All that it does is, it divides the number by two, checks the remainder, and if the remainder is zero, it returns a

'true' back.

Otherwise it returns a 'false' back.

What do you want to do is, we would want to call this method on each of these numbers.

And only if it is true, we'd want to print the number. So you'd want to do a forEach,

only for the numbers

where isEven is returning true.

How do we do that in the Functional approach?

The way we can do that is by creating a filter.

So I said .filter and over here, I can say isEven.

And because this is a static method, the way we can define that is by using a method reference FP01

Functional colon

colon isEven. The important thing in the method reference is that we are not really calling it, we are

not really calling it. We are just saying, okay, this is a method to be called.

We are declaring that this is a method to be called on each of the numbers and if it returns true back,

only then go to the next line of code.

So, let's move this comment out, down to this side and let's now execute this. Let's quickly create a local

variable for this list as well, numbers. And what we want to do is, copy this and we would want to print

even numbers in the list.

Let's comment this out.

Let's quickly run this and see what would happen.

Do we get only even numbers?

Yup.

That's cool.

Now, we saw that we were able to print all the even numbers in the list.

Once again, you can see the fact that once we have a stream of numbers, all that we needed to do was add

a check.

So, for each number, do this check. If that check is true, then you can actually go ahead and print the

number out.

Now, again you might be thinking that this method is a little bit more complex than this structured approach

because we needed to use a method called isEven.

How would it be, if I can actually directly define the entire

isEven method in here.

Instead of actually creating a separate method, having a return value, having the parameters defined,

having the body, having the return and all that, can we do it in a simpler way and directly define the

method in here.

Let's look at that in the subsequent step. Until then,

bye, bye.

Welcome back!

In the previous step, we solved the problem for printing even numbers in a Functional approach.

However, we needed to create a separate method, isEven.

We saw that the logic for this method is very very simple, and we had to do a lot of ceremony.

We had to add in a lot of detail to define the method and call it from here.

Is there a simpler way of doing it?

Let's look at it right now.

The simpler way of defining this specific thing is called a Lambda Expression.

So, what I'll do is, I'll comment this and I'll say .filter and over here,

what do we want to do is, we would want to define a Lambda Expression. So, what is a Lambda Expression?

A Lambda Expression is nothing but a simpler way of defining another method.

So, Lambda Expression is nothing but a method.

Very very simple.

However, in the Lambda Expression, you'd use a simpler syntax for creating this method.

What does this method accept as a parameter?

Let's start with that.

So, this method accepts number as the parameter, right?

So, what do we want to do is, we'd want to take number as the parameter and we would want to check.

What do we want to check?

We'd want to check, if number mod 2 == 0.

So, we would want to take a number and we would want to check, if

number mod 2 == 0, and return it back.

And this is something of a special kind of a syntax related to Lambda Expression.

It's hyphen, followed by greater than symbol.

So, this is almost like an arrow symbol.

So, what we are saying in here is, take the number in. So, take the number and check if number mod 2 == 0

and return it back. By default, in Lambda Expressions, if you just have

one statement present, it will return that value back.

So, what would happen in here?

It takes the number and returns the value of number mod 2 == 0.

How do I use it in our code?

I just need to copy this and put it in between parenthesis of filter.

So, what we are defending in here is, saying number, for each number,

for each number, what do we want to do? Check, if number mod 2 == 0.

If number mod 2 == 0, then return True back.

Otherwise, return False back.

Let's see what would happen. Cool!

No change in output, but you can see that now the code is much much more simpler,

because I don't really need to worry about this method anymore.

So, this method can be commented out and all logic that we have right now;

I'll move this line of code a little below.

So, the logic that we have right now is to convert the list of numbers into a stream

and for each of the numbers execute the filter.

So, is this condition True?

If the condition is True, then go ahead and do the print. As you can see in here, with functional programming,

we are focusing on the, 'What to do?'.

For each element, what to check? You are checking that the number is even.

For each element, what to do if the condition is True.

We would want to print it out. The thing which we learned in this specific step is something called a

Lambda Expression.

So, Lambda Expression, as we discussed, is a simplified representation of the method.

So over here, we had a method called isEven,

which was returning number mod 2 == 0.

We just used the same logic in here, in much more simpler syntax.

If this is the first Lambda Expression that you wrote, the syntax might look a little weird, little new,

and all that. Don't worry, we will be writing a number of Lambda Expressions in the

subsequent steps and you'd really get comfortable with them.

Let's quickly review the important concepts that we have learned until now.

Number one, with functional programming,

we focus on what to do.

We convert the numbers into a stream and for each element in that stream,

we specify what needs to be done.

A stream is nothing but a sequence of elements.

For each element, we would want to call the isEven method in here

and we use a method reference to define that in here.

The other approach to defining what needs to be done

with each number, is something called a Lambda Expression. With a Lambda Expression,

you can define the entire code directly in here. With a method reference,

we are actually referring to a method which is defined somewhere else.

However, with the Lambda Expression, we are actually defining the complete logic of the method right here.

I hope you are having a lot of fun and I'm sure a lot of these concepts are new

and as I said earlier, FP, functional programming, is actually a paradigm shift.

So, it will take some time for you to get adjusted to this.

So, follow along and keep watching the next steps

and I'm sure you'll be learning a lot about functional programming.

I'll see you in the next step.

Until then bye-bye.

Welcome back.

In this step, let's try and add a little bit more complexity into our Functionality.

What we'd want to do is, we would want to print squares of numbers.

Until now, we have been printing the numbers as is.

How about printing the squares of each of these numbers?

How do we do that?

Let's look at that.

So, I'll copy this method out. I'll say printSquaresofEvenNumbers.

So let's print squares only of the even numbers in the list.

So, we have a stream, we are allowing only the even numbers to go through, and then printing them.

However, over here, we would want to actually print the squares of the numbers.

How do I do that? The way I can do that is by doing something called a mapping.

So, what we'd want to do is, we would want to map each of the element, we would want to take each of the

element and map it to the square of the element.

So, we'd want to calculate the square of the each element and then print the square of the element.

So, how do we do the mapping? The way we can do the mapping is by saying map

and you can define the mapper function in here,

the mapper lambda expression in here. The mapper lambda expression is, take x or take any number,

and once you have the number, what we would want to do with the number? We would want to actually multiply

it by itself.

So, number * number.

So, this expression is called a mapping expression, where we are mapping a number to number into a number.

The result of this is at the end of it. The number would be multiplied by itself.

So, we'll calculate the square of the number.

And after that, the square would be printed.

Let's try and run this. Oops.

We have not changed the call in here.

So, we don't want to print even numbers in the list. We would want to print the squares of all numbers.

So, let's do this, printSquaresOfEvenNumbersInListFunctional and let's run this. Run Java application

and you can see that squares of all the numbers are being printed out.

Now, you can pause the video in here and try and do a few more things as an exercise. The two exercises

are Exercise 5 and Exercise 6.

Exercise 5 is to print the cubes of only the odd numbers. A cube is nothing, but a number multiplied

by itself three times.

So, three cube is equal to three into three into three, which is 27. Exercise 6 is to print the

number of characters in each course name.

So, I would want to print six characters.

Here it would be 11 characters,

here it would be three. So, instead of printing the course itself,

I would want to print the number of characters in that.

Now, you can pause the video in here and try those two things as an exercise.

Let's go ahead and solve them.

So, what we would want to do in the exercise is, I'm in FP01Exercises.java.

And what we'd want to do is, printCubesOfOddNumbers. And the way I can do that is very simple, right?

I would want to map each element, each number which is present in there.

What do I want to do with it?

I'd want to multiply by itself three times, number * number * number.

That's it.

Let's take this and let's use the list of numbers which we have already created and call this in here by

passing in numbers.

Let's see what would be happening. Run Java Application.

The code is a little messy.

So you can see that only for the odd numbers, the cubes are being printed.

Don't really worry about what's printed after this. This is a result from the courses stuff which is after

this.

So, that's cool.

We are now able to do the cubes of odd numbers.

The next exercise was to actually print the length of these courses.

How do we print the length of these courses? Let's look at it right now. So what do we want to do?

courses.stream().

We don't really want to filter anything. For all the courses, what do we want to do?

We'd want to print the length. So, we can map each of the courses. So each of the course,

what do we want to map it to?

We'd want to map it to course.length(). So, map

course to course.length() .forEach(System.out::println). Isn't it cool?

Let's not really worry about this.

Let's comment this out.

And let's run this code.

You can see, over here, that this is printing the lengths of each one of this. Just to be really really

clear,

what we'll do is, we'll append the course with the space and the course.length().

So, what we are doing in here is, course + " "

+ course.length. Let's run this.

You can see that it's printing Spring 6, Spring Boot 11 characters,

API is 3 characters, and so on and so forth.

As we discussed before, it's very very important to get your hands dirty with functional programming.

We are used to doing the traditional approach for a number of years

and there is a lot of unlearning to do before we would get comfortable with functional programming.

I hope you're having a lot of fun and I'll see you in the next step. Until then,

bye bye.

Welcome back.

Before we move into the next section, let's review some of the important concepts that we have learned

in this specific section.

The first thing that we have learnt is, in Functional programming we focus on specifying what to do.

First of all, we converted the List to a stream.

So, this is a sequence of elements

and for each element what should be done. Allow it,

if it's only an odd number. Print the element out to the console. Do a cube of the number.

So, for each element in this stream, we specified what needs to be done with it.

We used numbers.stream() to convert a list into a stream and then we looked at a couple of important

methods on the stream.

We looked at filter which allows us to specify a condition. Only if

that condition is matched, then the element would go further.

Otherwise, this element would be filtered out.

So, if I have a list of numbers and I would want to allow only even numbers to go through or odd numbers

to go through, then I can define a filter specifying what is the condition that needs to be checked on

the number. forEach is used to consume an element.

You take an element and print it.

That's what this specific thing helps us to do.

We use map to map one value to another value.

So over here, we took the number and we did a cube of it, number * number * number.

The other things which we looked at were Lambda Expressions.

You can see that filter, over here, uses a lambda expression. The map over here, uses another lambda expression.

Over here, we are using a lambda expression to take a course and append the course.length() to it.

We learnt that lambda expression is nothing but a simplified representation of a method.

So, this lambda expression over here which takes a number and returns if it's even, is similar to the method

which we wrote in here. It takes a parameter called number and it returns if that specific number is

even. So, instead of writing this much amount of code, we would write a simple lambda expression.

We also looked at Method References. Until now, we have used method references to call static methods.

println is a static method on System.out.

So, we are saying, on the element call System.out.println element. And we use the method reference

to specify that. We also created method references using custom static methods.

We created a method called isEven and we use the class name

: : isEven to call it. If you have not started doing the hands-on yet, I would recommend you to get

your hands dirty and write as many functional programs as possible.

I'll see you in the next section.

Until then, bye bye.
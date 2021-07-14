# Lab 06: Inheritance and Interfaces

[Code](lib/src/main/java/inhertiance)

[Test](lib/src/test/java/inhertiance)

In this Lab a Restaurant and Review classes had been made, each one has its own constructor.

The restaurant has 4 properties : name,stars, price category and reviews list, and it has a method to add a new review,
and I have overwritten the toString method.

The review class has 3 properties :author name,review body, and stars given. Also, the toString method is overwritten.

## Testing

For testing, I tested the constructor for each class, the toString, and the add review method in the restaurant class.

# Lab07

In this lab I added Shop and theater classes each has the same blueprint of restaurant but with different values in the constructor.
Also, I made the addReview method in a separate interface so each one of the classes can implement it with different syntax.

However, the theater class addReview differs from the other two classes, since the user can enter a movie name to review if he want, or he can add a review without it.

## Testing

For testing, I tested the constructor for each class, the toString, and the add review method in each class.

# Grep

This program is an implementation of the Unix command line tool **grep** using the Java programming language.

It is based on [this challenge](https://codingchallenges.fyi/challenges/challenge-grep/).

## Usage

clone the repo then compile it

``` javac Grep.java```

Then you can run it by passing plain text as argument

```echo "Roses are red \n Violes are blue, \n Sugar is sweet \n And so are you." | java Grep blue```

the output would be:

```Violets are blue,```

You can also pass a file as argument

``` java Grep blue violets_poem.txt```

And the output is going to be the same.

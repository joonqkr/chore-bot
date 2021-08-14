package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/** Driver class for Chore Bot.
 *  @author Joon Park
 */
 public class Main {

     /** Usage: java chore_bot.Main ARGS, where ARGS contains
     *  <COMMAND> <OPERAND> ....
     *  java chore_bot.Main */
     public static void main(String... args) {
        System.out.println("Hello, World!");
     }

    @Test
    public void choreTest() {
        assertEquals(1, 1);
    }
 }
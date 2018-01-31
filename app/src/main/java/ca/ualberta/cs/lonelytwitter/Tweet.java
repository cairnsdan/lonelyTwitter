/*
 * Tweet
 *
 * Version 1.0
 *
 * January 30, 2018
 *
 * Copyright (c) 2018 Team X. CMPUT301. University of Alberta - All Rights Reserved. You may use,
 * distribute, or modify this code under the terms and conditions of the
 * Code of Student Behavior at the University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by dezfuli on 1/16/18.
 */


/**
 * Represents a tweet
 *
 * @author Daniel Cairns
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Construct a tweet object.
     *
     * @param message tweet text
     */
    Tweet(String message){

        this.message = message;
        date = new Date();
//        message = message;
    }

    /**
     * Constructs a tweet object with a date.
     *
     * @param message tweet message
     * @param date tweet date
     */
    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Returns the message of a tweet
     *
     * @return tweet message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets the message of a tweet object.
     *
     * @param message tweet message
     * @throws TweetTooLongException the tweet message is over 148 characters
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Returns the date of a tweet
     *
     * @return tweet date
     */
    public Date getDate(){
        return date;
    }

    /**
     * Sets the date of the tweet object
     *
     * @param date tweet date
     */
    public void setDate(Date date){
        this.date = date;
    }

    public abstract Boolean isImportant();

    /**
     * Return string containing date and message of tweet
     *
     * @return tweet string
     */
    public String toString() {
        return date.toString() + " | " + message;
    }

}

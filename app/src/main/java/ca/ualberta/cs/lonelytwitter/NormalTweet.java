package ca.ualberta.cs.lonelytwitter;

/**
 * Created by dezfuli on 1/16/18.
 */
import java.util.Date;

/**
 * Specifies a normal tweet object
 *
 * @author Daniel Cairns
 * @see Tweet
 */
public class NormalTweet extends Tweet {

    /**
     * Construct a normal tweet
     *
     * @param message tweet text
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * Construct a normal tweet with a date
     *
     * @param message tweet text
     * @param date tweet date
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Return that tweet is not important
     *
     * @return always false
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}

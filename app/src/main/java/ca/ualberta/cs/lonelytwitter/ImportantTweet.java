package ca.ualberta.cs.lonelytwitter;

/**
 * Created by dezfuli on 1/16/18.
 */
import java.util.Date;

/**
 * Specifies an important Tweet object
 *
 * @author Daniel Cairns
 * @see Tweet
 */
public class ImportantTweet extends Tweet {

    /**
     * Construct an important tweet
     *
     * @param message tweet text
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * Construct an important tweet with a date
     *
     * @param message tweet text
     * @param date tweet date
     */
    ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Return that tweet is important
     *
     * @return always true
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}

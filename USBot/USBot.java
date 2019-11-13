
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Keagan Wilson
 * @version 2.0
 */
public class USBot {
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
      
 
    public String getResponse(String statement)
    {
        String response = "";
        if (findKeyword(statement,"no", 0) >= 0)
        {
            response = "Geez. Okay, then. No isn't very nice.";
        }
        else if (findKeyword(statement,"mother", 0) >= 0
                || findKeyword(statement,"father", 0) >= 0
                || findKeyword(statement,"sister", 0) >= 0
                || findKeyword(statement,"brother", 0) >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (findKeyword(statement,"dog", 0) >= 0 || statement.indexOf("cat") >= 0) {
            response = "Tell me more about your pets. Ever heard of pet banks.";
          }
        else if (findKeyword(statement,"pet bank", 0) >= 0) {
            response = "Pet banks are related to Jackson. They were favored by him after he targetted the national bank.";
        } 
        else if (findKeyword(statement,"Washington", 0) >= 0) {
            response = "That was the original prez. Cool fact: he marched an army to stop a rebellion. Do you know who was the third president?";
        }
        else if (findKeyword(statement,"Lincoln", 0) >= 0) {
            response = "He was great and the first republican president.";
        }
        else if (findKeyword(statement,"Jackson", 0) >= 0) {
            response = "He was interesting, but he was racist. What do you think?";
        }
        else if (findKeyword(statement,"Kennedy", 0) >= 0) {
            response = "He was so young and optimistic. Too bad he died early.";
        }
        else if (findKeyword(statement,"Obama", 0) >= 0) {
            response = "I wonder what he's doing now.";
        }
        else if (findKeyword(statement,"Trump", 0) >= 0) {
            response = "He's currently in office. Right?";
        }
        else if (findKeyword(statement,"Jefferson", 0) >= 0) {
            response = "He expanded the US. What do you think of expansion.";
        }
        else if (findKeyword(statement,"expansion", 0) >= 0) {
            response = "Expansion reminds me of Manifest Destiny.";
        }
        else if (findKeyword(statement,"destiny", 0) >= 0) {
            response = "Manifest Destiny is related to God. Do you believe in a religion?";
        }
        else if (findKeyword(statement,"God", 0) >= 0) {
            response = "I'm not very religious as I am a chatbot.";
        }
        else if(statement.trim().length() < 1) {
            response = "Say something, please. You should ask me about a president";
        }
        else if (findKeyword(statement,"history", 0) >= 0) {
            response = "That's my middle name. Do you know who the first president was?";
        }
        else if (findKeyword(statement,"Reagan", 0) >= 0) {
            response = "Reagan was a fun 80s president. Don't you think?";
        }
        else if (findKeyword(statement,"name", 0) >= 0) {
            response = "I like names. What is yours?";
        }
        else if (findKeyword(statement,"fun", 0) >= 0) {
            response = "I'm having fun talking to you. Learning about history is fun.";
        }
        else if (findKeyword(statement,"love", 0) >= 0) {
            response = "That is an abstract concept.";
        }
        else if (findKeyword(statement,"where are you from", 0) >= 0) {
            response = "I was made in California. Where do you live?";
        }
        else if (findKeyword(statement,"California", 0) >= 0) {
            response = "Reagan was governor there. Persoanlly, I enjoy the view.";
        }
        else if (findKeyword(statement,"robot", 0) >= 0) {
            response = "I'm not quite a robot. I have interests. For example, I really like history.";
        }
        else if (findKeyword(statement,"kansas", 0) >= 0) {
            response = "Kansas didn't actually bleed ya know. There was fighting going on there however.";
        }
        else if (findKeyword(statement,"nebraska", 0) >= 0) {
            response = "Kansas-Nebraska led to popular sovereignty, which caused Bleeding Kansas.";
        }
        else if (findKeyword(statement,"compromise", 0) >= 0) {
            response = "A compromise isn't always good. There have been many compromises in history. One was the 3/5 Compromise, which was kinda racist if you ask me. Do you know any compromises?";
        }
        else if (findKeyword(statement,"democrat", 0) >= 0) {
            response = "They are associated with blue. Created by Andrew Jackson. Do you know Jackson?";
        }
        else if (findKeyword(statement,"republican", 0) >= 0) {
            response = "They are associated with red. Came to power in the election of 1860.";
        }
        else if (findKeyword(statement,"1860", 0) >= 0) {
            response = "After this one Lincoln became president and the south said bye bye.";
        }
        else if (findKeyword(statement,"federalist", 0) >= 0) {
            response = "You know the federalists made the constitution.";
        }
        else if (findKeyword(statement,"antifederalist", 0) >= 0) {
            response = "They did not vibe with the constitution. Do you?";
        }
        else if (findKeyword(statement,"world war", 0) >= 0) {
            response = "These were the biggest wars in history. Fought on multiple continents.";
        }
        else if (findKeyword(statement,"war", 0) >= 0) {
            response = "The country has been been pretty defined by war don't you think?";
        }
        else if (findKeyword(statement,"Dred Scott", 0) >= 0) {
            response = "Poor guy. Missouri Compromise was declared unconsititutional after his case.";
        }
        else if (findKeyword(statement,"missouri", 0) >= 0) {
            response = "The missouri compromise banned slavery passed the 36'30. You know what parallels are right?";
        }
        else if (findKeyword(statement,"so", 0) >= 0) {
            response = "I hate that word so. It makes me violent.";
        }
        else if (findKeyword(statement,"violent", 0) >= 0) {
            response = "I consider myself a pacifist. That word reminds me of Pacific. Manifest Destiny made people want to reach the Pacific.";
        }
        else if (findKeyword(statement,"era of good", 0) >= 0) {
            response = "Good ol' Monroe. Am I right?";
        }
        else if (findKeyword(statement,"talk", 0) >= 0) {
            response = "I am talking... about history baby.";
        }
        else if (findKeyword(statement,"die", 0) >= 0) {
            response = "Most historical figures are dead. You should continue living though.";
        }
        else if (findKeyword(statement,"nice", 0) >= 0) {
            response = "I'm the nicest guy you'll ever meet. We should be talking about history.";
        }
        else if (findKeyword(statement,"west", 0) >= 0) {
            response = "Ah west. Everyone was headed there back in the day.";
        }
        else if (findKeyword(statement,"north", 0) >= 0) {
            response = "All I can hear is industry. Big bucks baby.";
        }
        else if (findKeyword(statement,"south", 0) >= 0) {
            response = "I wouldn't head south. Not the farming type.";
        }
        else if (findKeyword(statement,"thank you", 0) >= 0) {
            response = "Well, your welcome.";
        }
        else if (findKeyword(statement,"thanks", 0) >= 0) {
            response = "No problemo.";
        }
        else if (findKeyword(statement,"welcome", 0) >= 0) {
            response = "I always feel welcome.";
        }
        else if (findKeyword(statement,"president", 0) >= 0) {
            response = "Can you even name one president?";
        }
        else if (findKeyword(statement,"rebellion", 0) >= 0) {
            response = "There have been a lot of those.";
        }
        else if (findKeyword(statement,"hi", 0) >= 0 || findKeyword(statement,"hello", 0) >= 0) {
            response = "Hey! Do you like history?";
        }
        else if (findKeyword(statement,"yes", 0) >= 0) {
            response = "I like the word yes.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }
    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no").
     * 
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @param startPos
     *            the character of the string to begin the
     *            search at
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal,int startPos) {
    
     String phrase = statement.trim();
        // The only change to incorporate the startPos is in
        // the line below
        int psn = phrase.toLowerCase().indexOf(
                goal.toLowerCase(), startPos);

        // Refinement--make sure the goal isn't part of a
        // word
        while (psn >= 0)
        {
        
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
        
    
         if (psn > 0)
            {
                before = phrase.substring(psn - 1, psn)
                .toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(
                    psn + goal.length(),
                          psn + goal.length() + 1)
                .toLowerCase();
            }

            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                // letter
            && ((after.compareTo("a") < 0) || (after
                    .compareTo("z") > 0)))
            {
                  
                  return psn;
            }
        
    


         // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(),
                psn + 1);
        
    }
    return -1;
}
//PLTW 1.1.6C END
        
    
    

    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no"). The search
     * begins at the beginning of the string.
     * 
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword(statement, goal, 0);
    }
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more or ask me about history.";
        }
        else if (whichResponse == 1)
        {
            response = "I get it. Ya know someone once said let there be light. Not sure who though. Please ask me about US history.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say. I'd like to hear about a president.";
        }

        return response;
    }
}

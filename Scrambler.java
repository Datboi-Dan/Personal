import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scrambler
{

    public static void main(String[] args)
    {

        String test = "This is a test string.";
        System.out.println(scrambleWord("scientific"));
        String scrambledSentence = scrambleSentenceOld(test);
        System.out.println(scrambledSentence);
        System.out.println(scrambleSentence("I was crazy once!"));
        System.out.println(scramblePhrase("Crazy? I was crazy once! They locked me in a room. A rubber room. A rubber room with rats. And rats make me crazy."));

    }


    public static void checkAttributes(String input)
    {

        String uniqueCharacters = "";
        String uniqueLetters = "";
        String uniqueNonLetters = "";

        int characterCount = 0;
        int uniqueCharacterCount = 0;
        int letterCount = 0;
        int uniqueLetterCount = 0;
        int uniqueNonLetterCount = 0;
        int spaceCount = 0;

        for (int i = 0; i < input.length(); i++)
        {

            characterCount++;

            if (uniqueCharacters.indexOf(input.charAt(i)) == -1)
            {

                uniqueCharacterCount++;
                uniqueCharacters += input.charAt(i);

            }

            Pattern alphabet = Pattern.compile("[a-z]");
            Matcher matcher = alphabet.matcher(String.valueOf(input.charAt(i)));
            boolean isLetter = matcher.find();

            if (isLetter)
            {

                letterCount++;

                if (uniqueLetters.indexOf(input.charAt(i)) == -1)
                {

                    uniqueLetterCount++;
                    uniqueLetters += input.charAt(i);

                }

            }
            else
            {
                if (uniqueNonLetters.indexOf(input.charAt(i)) == -1)
                {

                    uniqueNonLetterCount++;
                    uniqueNonLetters += input.charAt(i);

                }

            }

            if (input.charAt(i) == ' ')
            {

                spaceCount++;

            }

        }

        System.out.print("Input: \"" + input + "\"\nCharacters: "
                + characterCount + "\nUnique Characters: "
                + uniqueCharacterCount + "\nLetters: "
                + letterCount + "\nUnique Letters: "
                + uniqueLetterCount + "\nUnique Non-Letters: "
                + uniqueNonLetterCount + "\nSpaces: "
                + spaceCount);

    }


    public static String scrambleWord(String word)
    {

        String wordCopy = word;
        String scrambledWord = "";

        for (int i = 0; i < word.length(); i++)
        {

            int randomIndex = (int)(Math.random() * wordCopy.length());
            scrambledWord += wordCopy.charAt(randomIndex);
            wordCopy = wordCopy.substring(0, randomIndex) + wordCopy.substring(randomIndex + 1);

        }

        return scrambledWord;

    }


    public static String scrambleSentenceOld(String input)
    {

        String newWord = "";
        String scrambledSentence = "";

        for (int i = 0; i < input.length(); i++)
        {


            if (input.charAt(i) == '.' || input.charAt(i) == ',' || input.charAt(i) == '\"' || input.charAt(i) == '\'' || input.charAt(i) == '!' || input.charAt(i) == '?' || input.charAt(i) == ' ')
            {

                scrambledSentence += scrambleWord(newWord) + input.charAt(i);
                newWord = "";

            }
            else
            {

                newWord += input.charAt(i);

            }

        }

        return scrambledSentence;

    }


    public static String scrambleSentence(String sentence)
    {

        int words = getWordCount(sentence);
        int wordIndex = 0;
        String takenIndices = "|";

        String scrambledSentence = "";
        String word = "";

        for (int i = 0; i < words; i++)
        {

            int randomIndex = (int)(Math.random() * words);
            while (takenIndices.indexOf("|" + randomIndex + "|") != -1)
            {

                randomIndex = (int)(Math.random() * words);

            }
            takenIndices += randomIndex + "|";

            for (int j = 0; j < sentence.length(); j++)
            {

                if (sentence.charAt(j) == ' ' || sentence.charAt(j) == '.' || sentence.charAt(j) == '!' || sentence.charAt(j) == '?')
                {

                    scrambledSentence += scrambleWord(word);
                    word = "";
                    wordIndex++;
                    continue;

                }

                if (wordIndex == randomIndex)
                {

                    word += sentence.charAt(j);

                }


            }

            scrambledSentence += " ";
            wordIndex = 0;

        }

        return scrambledSentence.substring(0, scrambledSentence.length() - 1) + sentence.charAt(sentence.length() - 1);

    }


    public static String scramblePhrase(String phrase)
    {

        int sentences = getSentenceCount(phrase);
        int sentenceIndex = 0;
        String takenIndices = "|";

        String scrambledPhrase = "";
        String sentence = "";

        for (int i = 0; i < sentences; i++)
        {

            int randomIndex = (int)(Math.random() * sentences);
            while (takenIndices.indexOf("|" + randomIndex + "|") != -1)
            {

                randomIndex = (int)(Math.random() * sentences);

            }
            takenIndices += randomIndex + "|";

            for (int j = 0; j < phrase.length(); j++)
            {

                if (phrase.charAt(j) == '.' || phrase.charAt(j) == '!' || phrase.charAt(j) == '?')
                {

                    if (sentenceIndex == randomIndex)
                    {

                        sentence += phrase.charAt(j);
                        scrambledPhrase += scrambleSentence(sentence) + " ";

                    }
                    sentence = "";
                    sentenceIndex++;
                    continue;

                }
                else if (phrase.charAt(j) == ' ' && (phrase.charAt(j - 1) == '.' || phrase.charAt(j - 1) == '!' || phrase.charAt(j - 1) == '?'))
                {

                    continue;

                }

                if (sentenceIndex == randomIndex)
                {

                    sentence += phrase.charAt(j);

                }


            }

            sentence = "";
            sentenceIndex = 0;

        }

        return scrambledPhrase;

    }


    public static int getWordCount(String input)
    {

        int count = 0;

        for (int i = 0; i < input.length(); i++)
        {

            if (input.charAt(i) == '.' || input.charAt(i) == '!' || input.charAt(i) == '?' || input.charAt(i) == ' ')
            {

               count++;

            }

        }

        return count;

    }

    public static int getSentenceCount(String input)
    {

        int count = 0;

        for (int i = 0; i < input.length(); i++)
        {

            if (input.charAt(i) == '.' || input.charAt(i) == '!' || input.charAt(i) == '?')
            {

                count++;

            }

        }

        return count;

    }

}

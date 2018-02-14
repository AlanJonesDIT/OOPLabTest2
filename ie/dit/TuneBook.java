package ie.dit;

import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;


public class TuneBook
{

	ArrayList<Tune> tunes = new ArrayList<Tune>();

	public TuneBook()
	{

		loadTuneBook(bookTitle);

	}

	public void loadTuneBook(String bookTitle)
    {

        // Adapted from: https://docs.oracle.com/javase/tutorial/essential/io/charstreams.html
        BufferedReader inputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(bookTitle));
            
            String l;
            while ((l = inputStream.readLine()) != null && (l.startsWith("X") || l.startsWith("T"))) {
                tunes.add(l);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (inputStream != null) {
                try
                {
                    inputStream.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

	public String toString()
	{
		StringBuffer sb = new StringBuffer();
      for(String tune:tunes)
      {
          sb.append(tune + "\n");
      }

      return sb.toString();
	}	

	public static void main(String[] args)
	{
		TuneBook tb = new TuneBook("hnj0.abc");
		System.out.println(tb);

		//Tune t = tb .findTune("Scotsman over the Border");
		// t.play();
	}


}
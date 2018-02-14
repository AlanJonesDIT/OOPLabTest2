package ie.dit;

import java.util.ArrayList;

public class Tune
{

	int x = 0;
	String title = "";
	String altTitle = "";
	String fullTitles = "";


	public String toString()
	{
		StringBuffer sb = new StringBuffer();
      for(String tune:tunes)
      {
          sb.append(fullTitles = x + ", " + title + ", " + altTitle);
      }

      return sb.toString();
	}	



}
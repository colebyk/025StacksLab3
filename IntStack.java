import java.util.ArrayList;

public class IntStack
{

	private ArrayList<Integer> listOfInts;

	public IntStack()
	{
		listOfInts = new ArrayList<Integer>();
	}

	public void push(int item)
	{
		listOfInts.add(item);
	}

	public int pop()
	{
		int temp = listOfInts.get(listOfInts.size()-1);
		listOfInts.remove(listOfInts.size()-1);
		return temp;
	}

	public boolean isEmpty()
	{
		if (listOfInts.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public int peek()
	{
		return listOfInts.get(listOfInts.size()-1);
	}
	
	public String toString() {
		String output = "[";
		for (int i = 0; i < listOfInts.size(); i++) {
			output += listOfInts.get(i);
			if (i != listOfInts.size()-1) {
				output += ", ";
			}
		}
		output += "]";
		return output;
	}

}
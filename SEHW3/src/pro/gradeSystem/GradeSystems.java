package pro.gradeSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class GradeSystems {
	private float[] weights = {(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.3,(float) 0.4};
	private HashMap<Integer,Grades> aList = new HashMap<>();
	
	public GradeSystems() throws FileNotFoundException{
		Scanner fileScan = new Scanner(new FileInputStream("gradeinput.txt"));
		while(fileScan.hasNextLine()){
			int ID = fileScan.nextInt();
			String name = fileScan.next();
			int lab1 = fileScan.nextInt();
			int lab2 = fileScan.nextInt();
			int lab3 = fileScan.nextInt();
			int midTerm = fileScan.nextInt();
			int finalExam = fileScan.nextInt();
			while(!fileScan.next().equals(""));
			Grades aGrade = new Grades(ID,name,lab1,lab2,lab3,midTerm,finalExam,weights);
			aList.put(ID, aGrade);
		}
		fileScan.close();
	}
	public boolean containsID(int ID){
		return aList.containsKey(ID);
	}
	public void showGrade(int ID){
		Grades aGrade = aList.get(ID);
	}
	public void showRank(int ID){
		int rank = 1;
		Grades aGrade = aList.get(ID);
		for(Grades value: aList.values()){
			if(aGrade.getTotalGrade()>value.getTotalGrade())
				++rank;
		}
		System.out.printf("%3s排名為第%d", aGrade.getName(), rank);
	}
	public void updateWeights(){
		showOldWeights();
		getNewWeights();
		
	}
	private void showOldWeights(){
		
	}
	private void getNewWeights(){
		float[] weights = new float[5];
		setWeights(weights);
	}
	private void setWeights(float[] weights){
		
	}
}

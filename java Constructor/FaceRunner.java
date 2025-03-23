class FaceRunner{
	public static void main(String[] args){
		
		int facefaceCount=1;
		String feature1="eyes";
		String type1="Oval";
		
		Face face1=new Face(facefaceCount,feature1,type1);
		
		System.out.println(face1.faceCount);
		System.out.println(face1.feature);
		System.out.println(face1.type);
		
		int faceCount2=2;
		String feature2="ears";
		String type2="Diamond";
		
		Face face2=new Face(faceCount2,feature2,type2);
		
		System.out.println(face2.faceCount);
		System.out.println(face2.feature);
		System.out.println(face2.type);
		
		int faceCount3=3;
		String feature3="nose";
		String type3="Round";
		
		Face face3=new Face(faceCount3,feature3,type3);
		
		System.out.println(face3.faceCount);
		System.out.println(face3.feature);
		System.out.println(face3.type);
		
		int faceCount4=4;
		String feature4="lips";
		String type4="Square";
		
		Face face4=new Face(faceCount4,feature4,type4);
		
		System.out.println(face4.faceCount);
		System.out.println(face4.feature);
		System.out.println(face4.type);
		
		int faceCount5=5;
		String feature5="eye brows";
		String type5="Heart";
		
		Face face5=new Face(faceCount5,feature5,type5);
		
		System.out.println(face5.faceCount);
		System.out.println(face5.feature);
		System.out.println(face5.type);
	}
	
	
}
	
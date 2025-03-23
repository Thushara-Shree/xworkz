class Hospital{
	public static void checkup(String patientName, int age, long mobile, String email, String sickness){
		System.out.println(patientName+","+age+","+mobile+","+email+","+sickness);
		Doctor.treatment(patientName,age);
	}
}
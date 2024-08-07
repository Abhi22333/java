class GanaviRunner{
    public static void main(String[] args) {
	    Clip clip = new Clip("Red", "Paperclip");
        Ganavi ganavi = new Ganavi("ganavi@example.com", clip);
        ganavi.details();
   
        Clip clip1 = new Clip("Pink", "Cluster");
        Ganavi ganavi1 = new Ganavi("ganavi1@example.com", clip1);
        ganavi1.details();
   
   }
   
   
}
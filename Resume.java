import java .awt.*;
class Resume 
{
public static void main(String[] args)
{

Frame f=new Frame("RESUME project of Group 4");

Label l0,l1,l2,l3,l4,l5,l6,l7;

l0=new Label(" RESUME");
l0.setBounds(300,50,550,30);

l1=new Label("Full Name :");
l1.setBounds(50,100,75,28);

l2=new Label(" DOB  :");
l2.setBounds(50,150,50,30);

l3=new Label(" Gender:");
l3.setBounds(50,200,50,30);

l4=new Label("Qualification :");
l4.setBounds(50,250,100,30);

l5=new Label("Address :");
l5.setBounds(50,300,52,30);	

l6=new Label("Hobbies :");
l6.setBounds(50,400,80,100);	

l7=new Label("State:");
l7.setBounds(50,545,50,35);	

f.add(l0);f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);

//TextFields
TextField t1,t2;
t1=new TextField();
t1.setBounds(140,105,280,25);
f.add(t1);

t2=new TextField();
t2.setBounds(140,153,200,25);
f.add(t2);



// CheckboxGroup(Radio Button)

CheckboxGroup cb=new CheckboxGroup();
Checkbox cb1=new Checkbox("Male",cb,false);
cb1.setBounds(110,200,50,30);
f.add(cb1);

Checkbox cb2=new Checkbox("Female",cb,false);
cb2.setBounds(180,200,100,30);
f.add(cb2);

// Checkbox (Select)

Checkbox cb1_1=new Checkbox("B.SC.IT");
cb1_1.setBounds(180,243,60,50);
f.add(cb1_1);

Checkbox cb2_1=new Checkbox("B.SC.CS");
cb2_1.setBounds(280,243,70,50);
f.add(cb2_1);

Checkbox cb3=new Checkbox("B.C.A");
cb3.setBounds(400,243,50,50);
f.add(cb3);

Checkbox cb4=new Checkbox("M.Sc");
cb4.setBounds(500,243,50,50);
f.add(cb4);

Checkbox cb5=new Checkbox("M.C.A");
cb5.setBounds(600,243,50,50);
f.add(cb5);

//TextArea for Address
TextArea a=new TextArea();
a.setBounds(130,300,520,100);
f.add(a);

//hobbies list
List hl=new List(7);
hl.setBounds(130,445,100,50);
hl.add("Codding");
hl.add("Cycling");
hl.add("Tracking");
hl.add("Singing");
hl.add("Dancing");
hl.add("Reading");
hl.add("Drawing");
hl.add("Cooking");
f.add(hl);

//Choice list
Choice cl=new Choice();
cl.setBounds(130,550,100,50);
cl.add("Maharashtra");
cl.add("Goa");
cl.add("M.P.");
cl.add("Gujrat");
cl.add("Karnatak");
cl.add("Telengana");
cl.add("Tamilnadu");
cl.add("Kerla");
cl.add("Punjab");
cl.add("Rajsatan");
cl.add("Hariyana");
cl.add("U.P.");
cl.add("U.K.");
cl.add("Chatthisgad");
cl.add("Manipur");
cl.add("Tripura");
cl.add("Meghalay");
cl.add("Jammu");
cl.add("Andhara Pradesh");
f.add(cl);
	
f.setSize(850,800);
f.setLayout(null);
f.setBackground(Color.YELLOW);
f.setVisible(true);
}
}




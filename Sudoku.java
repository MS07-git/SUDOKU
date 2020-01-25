import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Sudoku extends Frame implements KeyListener,WindowListener,ActionListener {
	
	TextField result,but1,but2,but3,but4,but5,but6,but7,but8,but9,but10,but11,but12,but13,but14,but15,but16,but17,but18,but19,but20,but21,but22,but23,but24,but25,but26,but27,but28,but29,but30,but31,but32,but33,but34,but35,but36,but37,but38,but39,but40,but41,but42,but43,but44,but45,but46,but47,but48,but49,but50,but51,but52,but53,but54,but55,but56,but57,but58,but59,but60,but61,but62,but63,but64,but65,but66,but67,but68,but69,but70,but71,but72,but73,but74,but75,but76,but77,but78,but79,but80, but81;
	Button reset,submit;
	
	Sudoku(){
		
		submit=new Button("SUBMIT");
		reset=new Button("RESET");
		result=new TextField(40);
		but1=new TextField(10);
		but2=new TextField(10);
		but3=new TextField(10);
		but4=new TextField(10);
		but5=new TextField(10);
		but6=new TextField(10);
		but7=new TextField(10);
		but8=new TextField(10);
		but9=new TextField(10);
		but10=new TextField(10);
        but11=new TextField(10);
        but12=new TextField(10);
        but13=new TextField(10);
        but14=new TextField(10);
        but15=new TextField(10);
        but16=new TextField(10);
        but17=new TextField(10);
        but18=new TextField(10);
        but19=new TextField(10);
        but20=new TextField(10);
        but21=new TextField(10);
        but22=new TextField(10);
        but23=new TextField(10);
        but24=new TextField(10);
        but25=new TextField(10);
        but26=new TextField(10);
        but27=new TextField(10);
        but28=new TextField(10);
        but29=new TextField(10);
        but30=new TextField(10);
        but31=new TextField(10);
        but32=new TextField(10);
        but33=new TextField(10);
        but34=new TextField(10);
        but35=new TextField(10);
        but36=new TextField(10);
        but37=new TextField(10);
        but38=new TextField(10);
        but39=new TextField(10);
        but40=new TextField(10);
        but41=new TextField(10);
        but42=new TextField(10);
        but43=new TextField(10);
        but44=new TextField(10);
        but45=new TextField(10);
        but46=new TextField(10);
        but47=new TextField(10);
        but48=new TextField(10);
        but49=new TextField(10);
        but50=new TextField(10);
        but51=new TextField(10);
        but52=new TextField(10);
        but53=new TextField(10);
        but54=new TextField(10);
        but55=new TextField(10);
        but56=new TextField(10);
        but57=new TextField(10);
        but58=new TextField(10);
        but59=new TextField(10);
        but60=new TextField(10);
        but61=new TextField(10);
        but62=new TextField(10);
        but63=new TextField(10);
        but64=new TextField(10);
        but65=new TextField(10);
        but66=new TextField(10);
        but67=new TextField(10);
        but68=new TextField(10);
        but69=new TextField(10);
        but70=new TextField(10);
        but71=new TextField(10);
        but72=new TextField(10);
        but73=new TextField(10);
        but74=new TextField(10);
        but75=new TextField(10);
        but76=new TextField(10);
        but77=new TextField(10);
        but78=new TextField(10);
        but79=new TextField(10);
        but80=new TextField(10);
        but81=new TextField(10);
        
        add(but1);add(but2);add(but3);add(but4);add(but5);add(but6);add(but7);add(but8);add(but9);
        add(but10);add(but11);add(but12);add(but13);add(but14);add(but15);add(but16);add(but17);add(but18);
        add(but19);add(but20);add(but21);add(but22);add(but23);add(but24);add(but25);add(but26);add(but27);
        add(but28);add(but29);add(but30);add(but31);add(but32);add(but33);add(but34);add(but35);add(but36);
        add(but37);add(but38);add(but39);add(but40);add(but41);add(but42);add(but43);add(but44);add(but45);
        add(but46);add(but47);add(but48);add(but49);add(but50);add(but51);add(but52);add(but53);add(but54);
        add(but55);add(but56);add(but57);add(but58);add(but59);add(but60);add(but61);add(but62);add(but63);
        add(but64);add(but65);add(but66);add(but67);add(but68);add(but69);add(but70);add(but71);add(but72);
        add(but73);add(but74);add(but75);add(but76);add(but77);add(but78);add(but79);add(but80);add(but81);
	    add(submit);
        add(reset);
	    add(result);
	    

	    reset.setFont(new Font("Normal",Font.BOLD,20));
		submit.setFont(new Font("Normal",Font.BOLD,20));
		result.setFont(new Font("Normal",Font.PLAIN,20));
	    
	   but1.addKeyListener(this);
 	   but2.addKeyListener(this);
 	   but3.addKeyListener(this);
 	   but4.addKeyListener(this);
 	   but5.addKeyListener(this);
 	   but6.addKeyListener(this);
 	   but7.addKeyListener(this);
 	   but8.addKeyListener(this);
 	   but9.addKeyListener(this);
 	   but10.addKeyListener(this);
 	   but11.addKeyListener(this);
 	   but12.addKeyListener(this);
 	   but13.addKeyListener(this);
 	   but14.addKeyListener(this);
 	   but15.addKeyListener(this);
 	   but16.addKeyListener(this);
 	   but17.addKeyListener(this);
 	   but18.addKeyListener(this);
 	   but19.addKeyListener(this);
 	   but20.addKeyListener(this);
 	   but21.addKeyListener(this);
 	   but22.addKeyListener(this);
 	   but23.addKeyListener(this);
 	   but24.addKeyListener(this);
 	   but25.addKeyListener(this);
 	   but26.addKeyListener(this);
 	   but27.addKeyListener(this);
 	   but28.addKeyListener(this);
 	   but29.addKeyListener(this);
 	   but30.addKeyListener(this);
 	   but31.addKeyListener(this);
 	   but32.addKeyListener(this);
 	   but33.addKeyListener(this);
 	   but34.addKeyListener(this);
 	   but35.addKeyListener(this);
 	   but36.addKeyListener(this);
 	   but37.addKeyListener(this);
 	   but38.addKeyListener(this);
 	   but39.addKeyListener(this);
 	   but40.addKeyListener(this);
 	   but41.addKeyListener(this);
 	   but42.addKeyListener(this);
 	   but43.addKeyListener(this);
 	   but44.addKeyListener(this);
 	   but45.addKeyListener(this);
 	   but46.addKeyListener(this);
 	   but47.addKeyListener(this);
 	   but48.addKeyListener(this);
 	   but49.addKeyListener(this);
 	   but50.addKeyListener(this);
 	   but51.addKeyListener(this);
 	   but52.addKeyListener(this);
 	   but53.addKeyListener(this);
 	   but54.addKeyListener(this);
 	   but55.addKeyListener(this);
 	   but56.addKeyListener(this);
 	   but57.addKeyListener(this);
 	   but58.addKeyListener(this);
 	   but59.addKeyListener(this);
 	   but60.addKeyListener(this);
 	   but61.addKeyListener(this);
 	   but62.addKeyListener(this);
 	   but63.addKeyListener(this);
 	   but64.addKeyListener(this);
 	   but65.addKeyListener(this);
 	   but66.addKeyListener(this);
 	   but67.addKeyListener(this);
 	   but68.addKeyListener(this);
 	   but69.addKeyListener(this);
 	   but70.addKeyListener(this);
 	   but71.addKeyListener(this);
 	   but72.addKeyListener(this);
 	   but73.addKeyListener(this);
 	   but74.addKeyListener(this);
 	   but75.addKeyListener(this);
 	   but76.addKeyListener(this);
 	   but77.addKeyListener(this);
 	   but78.addKeyListener(this);
 	   but79.addKeyListener(this);
 	   but80.addKeyListener(this);
 	   but81.addKeyListener(this);
 	  
 	   reset.addActionListener(this);
 	   submit.addActionListener(this);
 	   
 	   addWindowListener(this);
        
	   setLayout(null);
	   but1.setBounds(6,32,30,30);
	   but2.setBounds(36,32,30,30);
	   but3.setBounds(66,32,30,30);
	   but4.setBounds(100,32,30,30);
	   but5.setBounds(130,32,30,30);
	   but6.setBounds(160,32,30,30);
	   but7.setBounds(194,32,30,30);
	   but8.setBounds(224,32,30,30);
	   but9.setBounds(254,32,30,30);
	   but10.setBounds(6,62,30,30);
	   but11.setBounds(36,62,30,30);
	   but12.setBounds(66,62,30,30);
	   but13.setBounds(100,62,30,30);
	   but14.setBounds(130,62,30,30);
	   but15.setBounds(160,62,30,30);
	   but16.setBounds(194,62,30,30);
	   but17.setBounds(224,62,30,30);
	   but18.setBounds(254,62,30,30);
	   but19.setBounds(6,92,30,30);
	   but20.setBounds(36,92,30,30);
	   but21.setBounds(66,92,30,30);
	   but22.setBounds(100,92,30,30);
	   but23.setBounds(130,92,30,30);
	   but24.setBounds(160,92,30,30);
	   but25.setBounds(194,92,30,30);
	   but26.setBounds(224,92,30,30);
	   but27.setBounds(254,92,30,30);
	   but28.setBounds(6,126,30,30);
	   but29.setBounds(36,126,30,30);
	   but30.setBounds(66,126,30,30);
	   but31.setBounds(100,126,30,30);
	   but32.setBounds(130,126,30,30);
	   but33.setBounds(160,126,30,30);
	   but34.setBounds(194,126,30,30);
	   but35.setBounds(224,126,30,30);
	   but36.setBounds(254,126,30,30);
	   but37.setBounds(6,156,30,30);
	   but38.setBounds(36,156,30,30);
	   but39.setBounds(66,156,30,30);
	   but40.setBounds(100,156,30,30);
	   but41.setBounds(130,156,30,30);
	   but42.setBounds(160,156,30,30);
	   but43.setBounds(194,156,30,30);
	   but44.setBounds(224,156,30,30);
	   but45.setBounds(254,156,30,30);
	   but46.setBounds(6,186,30,30);
	   but47.setBounds(36,186,30,30);
	   but48.setBounds(66,186,30,30);
	   but49.setBounds(100,186,30,30);
	   but50.setBounds(130,186,30,30);
	   but51.setBounds(160,186,30,30);
	   but52.setBounds(194,186,30,30);
	   but53.setBounds(224,186,30,30);
	   but54.setBounds(254,186,30,30);
	   but55.setBounds(6,220,30,30);
	   but56.setBounds(36,220,30,30);
	   but57.setBounds(66,220,30,30);
	   but58.setBounds(100,220,30,30);
	   but59.setBounds(130,220,30,30);
	   but60.setBounds(160,220,30,30);
	   but61.setBounds(194,220,30,30);
	   but62.setBounds(224,220,30,30);
	   but63.setBounds(254,220,30,30);
	   but64.setBounds(6,250,30,30);
	   but65.setBounds(36,250,30,30);
	   but66.setBounds(66,250,30,30);
	   but67.setBounds(100,250,30,30);
	   but68.setBounds(130,250,30,30);
	   but69.setBounds(160,250,30,30);
	   but70.setBounds(194,250,30,30);
	   but71.setBounds(224,250,30,30);
	   but72.setBounds(254,250,30,30);
	   but73.setBounds(6,280,30,30);
	   but74.setBounds(36,280,30,30);
	   but75.setBounds(66,280,30,30);
	   but76.setBounds(100,280,30,30);
	   but77.setBounds(130,280,30,30);
	   but78.setBounds(160,280,30,30);
	   but79.setBounds(194,280,30,30);
	   but80.setBounds(224,280,30,30);
	   but81.setBounds(254,280,30,30);
	   reset.setBounds(6,376,279,30);
	   submit.setBounds(6,345,279,30);
	   result.setBounds(6,312,278,30);
	   
	   
	   but1.setEditable(false);
	   but1.setBackground(Color.LIGHT_GRAY);
	   but1.setText(" 8");
	   but1.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but2.setText("");
	   but2.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but4.setText("");
	   but4.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but5.setText("");
	   but5.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but3.setEditable(false);
	   but3.setBackground(Color.LIGHT_GRAY);
	   but3.setText(" 6");
	   but3.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but6.setEditable(false);
	   but6.setBackground(Color.LIGHT_GRAY);
	   but6.setText(" 3");
	   but6.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but7.setText("");
	   but7.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but8.setEditable(false);
	   but8.setBackground(Color.LIGHT_GRAY);
	   but8.setText(" 9");
	   but8.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but9.setText("");
	   but9.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but10.setText("");
	   but10.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but11.setEditable(false);
	   but11.setBackground(Color.LIGHT_GRAY);
	   but11.setText(" 4");
	   but11.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but12.setText("");
	   but12.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but13.setText("");
	   but13.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but14.setEditable(false);
	   but14.setBackground(Color.LIGHT_GRAY);
	   but14.setText(" 1");
	   but14.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but15.setText("");
	   but15.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but16.setText("");
	   but16.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but17.setEditable(false);
	   but17.setBackground(Color.LIGHT_GRAY);
	   but17.setText(" 6");
	   but17.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but18.setEditable(false);
	   but18.setBackground(Color.LIGHT_GRAY);
	   but18.setText(" 8");
	   but18.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but19.setEditable(false);
	   but19.setBackground(Color.LIGHT_GRAY);
	   but19.setText(" 2");
	   but19.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but20.setText("");
	   but20.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but21.setText("");
	   but21.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but22.setEditable(false);
	   but22.setBackground(Color.LIGHT_GRAY);
	   but22.setText(" 8");
	   but22.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but23.setEditable(false);
	   but23.setBackground(Color.LIGHT_GRAY);
	   but23.setText(" 7");
	   but23.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but24.setText("");
	   but24.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but25.setText("");
	   but25.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but26.setText("");
	   but26.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but27.setEditable(false);
	   but27.setBackground(Color.LIGHT_GRAY);
	   but27.setText(" 5");
	   but27.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but28.setEditable(false);
	   but28.setBackground(Color.LIGHT_GRAY);
	   but28.setText(" 1");
	   but28.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but29.setText("");
	   but29.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but30.setEditable(false);
	   but30.setBackground(Color.LIGHT_GRAY);
	   but30.setText(" 8");
	   but30.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but31.setText("");
	   but31.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but32.setText("");
	   but32.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but33.setEditable(false);
	   but33.setBackground(Color.LIGHT_GRAY);
	   but33.setText(" 5");
	   but33.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but34.setText("");
	   but34.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but35.setEditable(false);
	   but35.setBackground(Color.LIGHT_GRAY);
	   but35.setText(" 2");
	   but35.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but36.setText("");
	   but36.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but37.setText("");
	   but37.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but38.setEditable(false);
	   but38.setBackground(Color.LIGHT_GRAY);
	   but38.setText(" 3");
	   but38.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but39.setText("");
	   but39.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but40.setEditable(false);
	   but40.setBackground(Color.LIGHT_GRAY);
	   but40.setText(" 1");
	   but40.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but41.setText("");
	   but41.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but42.setText("");
	   but42.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but43.setText("");
	   but43.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but44.setEditable(false);
	   but44.setBackground(Color.LIGHT_GRAY);
	   but44.setText(" 5");
	   but44.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but45.setText("");
	   but45.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but46.setEditable(false);
	   but46.setBackground(Color.LIGHT_GRAY);
	   but46.setText(" 7");
	   but46.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but47.setText("");
	   but47.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but48.setEditable(false);
	   but48.setBackground(Color.LIGHT_GRAY);
	   but48.setText(" 5");
	   but48.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but49.setText("");
	   but49.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but50.setEditable(false);
	   but50.setBackground(Color.LIGHT_GRAY);
	   but50.setText(" 3");
	   but50.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but51.setText("");
	   but51.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but52.setEditable(false);
	   but52.setBackground(Color.LIGHT_GRAY);
	   but52.setText(" 9");
	   but52.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but53.setText("");
	   but53.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but54.setText("");
	   but54.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but55.setText("");
	   but55.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but56.setEditable(false);
	   but56.setBackground(Color.LIGHT_GRAY);
	   but56.setText(" 2");
	   but56.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but57.setEditable(false);
	   but57.setBackground(Color.LIGHT_GRAY);
	   but57.setText(" 1");
	   but57.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but58.setText("");
	   but58.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but59.setText("");
	   but59.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but60.setEditable(false);
	   but60.setBackground(Color.LIGHT_GRAY);
	   but60.setText(" 7");
	   but60.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but61.setText("");
	   but61.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but62.setEditable(false);
	   but62.setBackground(Color.LIGHT_GRAY);
	   but62.setText(" 4");
	   but62.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but63.setText("");
	   but63.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but64.setEditable(false);
	   but64.setBackground(Color.LIGHT_GRAY);
	   but64.setText(" 6");
	   but64.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but65.setText("");
	   but65.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but66.setText("");
	   but66.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but67.setText("");
	   but67.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but68.setEditable(false);
	   but68.setBackground(Color.LIGHT_GRAY);
	   but68.setText(" 2");
	   but68.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but69.setText("");
	   but69.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but70.setEditable(false);
	   but70.setBackground(Color.LIGHT_GRAY);
	   but70.setText(" 8");
	   but70.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but71.setText("");
	   but71.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but72.setText("");
	   but72.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but73.setText("");
	   but73.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but74.setEditable(false);
	   but74.setBackground(Color.LIGHT_GRAY);
	   but74.setText(" 8");
	   but74.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but75.setEditable(false);
	   but75.setBackground(Color.LIGHT_GRAY);
	   but75.setText(" 7");
	   but75.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but76.setEditable(false);
	   but76.setBackground(Color.LIGHT_GRAY);
	   but76.setText(" 6");
	   but76.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but77.setText("");
	   but77.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but78.setEditable(false);
	   but78.setBackground(Color.LIGHT_GRAY);
	   but78.setText(" 4");
	   but78.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but79.setText("");
	   but79.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but80.setText("");
	   but80.setFont(new Font("NORMAL",Font.PLAIN,20));
	   but81.setEditable(false);
	   but81.setBackground(Color.LIGHT_GRAY);
	   but81.setText(" 3");
	   but81.setFont(new Font("NORMAL",Font.PLAIN,20));
	   
	   addWindowListener(this);
 	   
	   setResizable(false);
	   setBackground(Color.DARK_GRAY);
	   setSize(290, 410);//459//379
	   setVisible(true);
	   
	}
	
	public static void main(String []args) {
		new Sudoku();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getSource()==reset)
		{
			but4.setText("");
			but5.setText("");
		}
		
		if(arg0.getSource()==reset)
		{
			
			  
			   but2.setText(" ");
			   but4.setText(" ");
			   but5.setText(" ");
			   but7.setText(" ");
			   but9.setText(" ");
			   but10.setText(" ");
			   but12.setText(" ");
			   but13.setText(" ");
			   but15.setText(" ");
			   but16.setText(" ");
			   but20.setText(" ");
			   but21.setText(" ");
			   but24.setText(" ");
			   but25.setText(" ");
			   but26.setText(" ");
			   but29.setText(" ");
			   but31.setText(" ");
			   but32.setText(" ");
			   but34.setText(" ");
			   but36.setText(" ");
			   but37.setText(" ");
			   but39.setText(" ");
			   but41.setText(" ");
			   but42.setText(" ");
			   but43.setText(" ");
			   but45.setText(" ");
			   but47.setText(" ");
			   but49.setText(" ");
			   but51.setText(" ");
			   but53.setText(" ");
			   but54.setText(" ");
			   but55.setText(" ");
			   but58.setText(" ");
			   but59.setText(" ");
			   but61.setText(" ");
			   but63.setText(" ");
			   but65.setText(" ");
			   but66.setText(" ");
		  	   but67.setText(" ");
			   but69.setText(" ");
			   but71.setText(" ");
			   but72.setText(" ");
			   but73.setText(" ");
			   but77.setText(" ");
			   but79.setText(" ");
			   but80.setText(" ");
			   result.setText("");
			   
		}

		
		if(arg0.getSource()==submit){
			if((Double.parseDouble(but2.getText()))== 7&&Double.parseDouble(but4.getText())==5&&Double.parseDouble(but5.getText())==4&&Double.parseDouble(but7.getText())==1&&Double.parseDouble(but9.getText())==2&&Double.parseDouble(but10.getText())==5&&Double.parseDouble(but12.getText())==3&&Double.parseDouble(but13.getText())==2&&Double.parseDouble(but15.getText())==9&&Double.parseDouble(but16.getText())==7&&Double.parseDouble(but20.getText())==1&&Double.parseDouble(but21.getText())==9&&Double.parseDouble(but24.getText())==6&&Double.parseDouble(but25.getText())==4&&Double.parseDouble(but26.getText())==3&&Double.parseDouble(but29.getText())==9&&Double.parseDouble(but31.getText())==7&&Double.parseDouble(but32.getText())==6&&Double.parseDouble(but34.getText())==3&&Double.parseDouble(but36.getText())==4&&Double.parseDouble(but37.getText())==4&&Double.parseDouble(but39.getText())==2&&Double.parseDouble(but41.getText())==9&&Double.parseDouble(but42.getText())==8&&Double.parseDouble(but43.getText())==6&&Double.parseDouble(but45.getText())==7&&Double.parseDouble(but47.getText())==6&&Double.parseDouble(but49.getText())==4&&Double.parseDouble(but51.getText())==2&&Double.parseDouble(but53.getText())==8&&Double.parseDouble(but54.getText())==1&&Double.parseDouble(but55.getText())==3&&Double.parseDouble(but58.getText())==9&&Double.parseDouble(but59.getText())==8&&Double.parseDouble(but61.getText())==5&&Double.parseDouble(but63.getText())==6&&Double.parseDouble(but65.getText())==5&&Double.parseDouble(but66.getText())==4&&Double.parseDouble(but67.getText())==3&&Double.parseDouble(but69.getText())==1&&Double.parseDouble(but71.getText())==7&&Double.parseDouble(but72.getText())==9&&Double.parseDouble(but73.getText())==9&&Double.parseDouble(but77.getText())==5&&Double.parseDouble(but79.getText())==2&&Double.parseDouble(but80.getText())==1){
		
			result.setText("***********YOU WIN**********");
			
		}
		else
		{
			result.setText("***********YOU LOSE**********");
		}
	}
		
		
				
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		char c= arg0.getKeyChar();
		if(!Character.isDigit(c))
			arg0.consume();
	}
		
}

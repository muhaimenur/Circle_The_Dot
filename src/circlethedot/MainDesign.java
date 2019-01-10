/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlethedot;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.PriorityQueue;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Muhaimenur
 */
public class MainDesign extends javax.swing.JFrame {

    /**
     * Creates new form MainDesign
     */
    int adjacency_matrix[][];
    int color[],par[],cost[],endPoint[],SPath[];
    String select;
    int node = 154, start,end,r,c,b,count=0, shortCount=150,p,path,start2,k,tag=0,tag2=0,l,num2,node2=1, BfsTag=0,lastPoint,againtag,computerCount=0,HumanCount=0;
    public MainDesign() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        FirstRun();
    }
    public static void music() {
        InputStream in;
        try {
            in = new FileInputStream(new File("C:\\Users\\Muhaimenur\\Desktop\\stepSound.wav"));
            AudioStream audio = new AudioStream(in);
            AudioPlayer.player.start(audio);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void FirstRun()
    {
        node = 154;
        count=0;shortCount=150;tag=0;tag2=0;node2=1; BfsTag=0;computerCount=0;HumanCount=0;againtag=0;
        adjacency_matrix = new int[170][170];
        color = new int[500];
        cost= new int[500];
        par = new int[500];
        SPath = new int[100];
        endPoint = new int[47];
        int i,j;
        //End Point Initialization
        endPoint[1]=1;endPoint[2]=2;endPoint[3]=3;endPoint[4]=4;endPoint[5]=5;endPoint[6]=6;endPoint[7]=7;endPoint[8]=8;endPoint[9]=9;endPoint[10]=10;endPoint[11]=11;endPoint[12]=12;endPoint[13]=13;endPoint[14]=14;endPoint[15]=15;
        endPoint[16]=28;
        endPoint[17]=29;
        endPoint[18]=42;
        endPoint[19]=43;
        endPoint[20]=56;
        endPoint[21]=57;
        endPoint[22]=70;
        endPoint[23]=71;
        endPoint[24]=84;
        endPoint[25]=85;
        endPoint[26]=98;
        endPoint[27]=99;
        endPoint[28]=112;
        endPoint[29]=113;
        endPoint[30]=126;
        endPoint[31]=127;
        endPoint[32]=140;endPoint[33]=141;endPoint[34]=142;endPoint[35]=143;endPoint[36]=144;endPoint[37]=145;endPoint[38]=146;endPoint[39]=147;endPoint[40]=148;endPoint[41]=149;endPoint[42]=150;endPoint[43]=151;endPoint[44]=152;endPoint[45]=153;endPoint[46]=154;
        
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton18.setEnabled(true);
        jButton19.setEnabled(true);
        jButton20.setEnabled(true);
        jButton21.setEnabled(true);
        jButton22.setEnabled(true);
        jButton23.setEnabled(true);
        jButton24.setEnabled(true);
        jButton25.setEnabled(true);
        jButton26.setEnabled(true);
        jButton27.setEnabled(true);
        jButton30.setEnabled(true);
        jButton31.setEnabled(true);
        jButton32.setEnabled(true);
        jButton33.setEnabled(true);
        jButton34.setEnabled(true);
        jButton35.setEnabled(true);
        jButton36.setEnabled(true);
        jButton37.setEnabled(true);
        jButton38.setEnabled(true);
        jButton39.setEnabled(true);
        jButton40.setEnabled(true);
        jButton41.setEnabled(true);
        jButton44.setEnabled(true);
        jButton45.setEnabled(true);
        jButton46.setEnabled(true);
        jButton47.setEnabled(true);
        jButton48.setEnabled(true);
        jButton49.setEnabled(true);
        jButton50.setEnabled(true);
        jButton51.setEnabled(true);
        jButton52.setEnabled(true);
        jButton53.setEnabled(true);
        jButton54.setEnabled(true);
        jButton55.setEnabled(true);
        jButton58.setEnabled(true);
        jButton59.setEnabled(true);
        jButton60.setEnabled(true);
        jButton61.setEnabled(true);
        jButton62.setEnabled(true);
        jButton63.setEnabled(true);
        jButton64.setEnabled(true);
        jButton65.setEnabled(true);
        jButton66.setEnabled(true);
        jButton67.setEnabled(true);
        jButton68.setEnabled(true);
        jButton69.setEnabled(true);
        jButton72.setEnabled(true);
        jButton73.setEnabled(true);
        jButton74.setEnabled(true);
        jButton75.setEnabled(true);
        jButton76.setEnabled(true);
        jButton77.setEnabled(true);
        jButton78.setEnabled(true);
        jButton79.setEnabled(true);
        jButton80.setEnabled(true);
        jButton81.setEnabled(true);
        jButton82.setEnabled(true);
        jButton83.setEnabled(true);
        jButton86.setEnabled(true);
        jButton87.setEnabled(true);
        jButton88.setEnabled(true);
        jButton89.setEnabled(true);
        jButton90.setEnabled(true);
        jButton91.setEnabled(true);
        jButton92.setEnabled(true);
        jButton93.setEnabled(true);
        jButton94.setEnabled(true);
        jButton95.setEnabled(true);
        jButton96.setEnabled(true);
        jButton97.setEnabled(true);
        jButton100.setEnabled(true);
        jButton101.setEnabled(true);
        jButton102.setEnabled(true);
        jButton103.setEnabled(true);
        jButton104.setEnabled(true);
        jButton105.setEnabled(true);
        jButton106.setEnabled(true);
        jButton107.setEnabled(true);
        jButton108.setEnabled(true);
        jButton109.setEnabled(true);
        jButton110.setEnabled(true);
        jButton111.setEnabled(true);
        jButton114.setEnabled(true);
        jButton115.setEnabled(true);
        jButton116.setEnabled(true);
        jButton117.setEnabled(true);
        jButton118.setEnabled(true);
        jButton119.setEnabled(true);
        jButton120.setEnabled(true);
        jButton121.setEnabled(true);
        jButton122.setEnabled(true);
        jButton123.setEnabled(true);
        jButton124.setEnabled(true);
        jButton125.setEnabled(true);
        jButton128.setEnabled(true);
        jButton129.setEnabled(true);
        jButton130.setEnabled(true);
        jButton131.setEnabled(true);
        jButton132.setEnabled(true);
        jButton133.setEnabled(true);
        jButton134.setEnabled(true);
        jButton135.setEnabled(true);
        jButton136.setEnabled(true);
        jButton137.setEnabled(true);
        jButton138.setEnabled(true);
        jButton139.setEnabled(true);
        jButton142.setEnabled(true);
        jButton143.setEnabled(true);
        jButton144.setEnabled(true);
        jButton145.setEnabled(true);
        jButton146.setEnabled(true);
        jButton147.setEnabled(true);
        jButton148.setEnabled(true);
        jButton149.setEnabled(true);
        jButton150.setEnabled(true);
        jButton151.setEnabled(true);
        jButton152.setEnabled(true);
        jButton153.setEnabled(true);
        jButton154.setEnabled(true);

            jButton16.setBackground(null);

            jButton17.setBackground(null);
        
            jButton18.setBackground(null);
        
            jButton19.setBackground(null);
        
            jButton20.setBackground(null);
        
            jButton21.setBackground(null);
        
            jButton22.setBackground(null);
        
            jButton23.setBackground(null);
        
            jButton24.setBackground(null);
        
            jButton25.setBackground(null);
        
            jButton26.setBackground(null);
        
            jButton27.setBackground(null);
        
            jButton30.setBackground(null);
        
            jButton31.setBackground(null);
       
            jButton32.setBackground(null);
        
            jButton33.setBackground(null);
        
            jButton34.setBackground(null);
        
            jButton35.setBackground(null);
        
            jButton36.setBackground(null);
        
            jButton37.setBackground(null);
        
            jButton38.setBackground(null);
        
            jButton39.setBackground(null);
        
            jButton40.setBackground(null);
        
            jButton41.setBackground(null);
        
            jButton44.setBackground(null);
       
            jButton45.setBackground(null);
        
            jButton46.setBackground(null);
       
            jButton47.setBackground(null);
        
            jButton48.setBackground(null);
        
            jButton49.setBackground(null);
        
            jButton50.setBackground(null);
        
            jButton51.setBackground(null);
        
            jButton52.setBackground(null);
        
            jButton53.setBackground(null);
       
            jButton54.setBackground(null);
        
            jButton55.setBackground(null);
        
            jButton58.setBackground(null);
        
            jButton59.setBackground(null);
        
            jButton60.setBackground(null);
        
            jButton61.setBackground(null);
        
            jButton62.setBackground(null);
        
            jButton63.setBackground(null);
        
            jButton64.setBackground(null);
        
            jButton65.setBackground(null);
        
            jButton66.setBackground(null);
        
            jButton67.setBackground(null);
        
            jButton68.setBackground(null);
        
            jButton69.setBackground(null);
        
            jButton72.setBackground(null);
        
            jButton73.setBackground(null);
       
            jButton74.setBackground(null);
        
            jButton75.setBackground(null);
        
            jButton76.setBackground(null);
        
            jButton77.setBackground(null);
        
            jButton78.setBackground(null);
        
            jButton79.setBackground(null);
        
            jButton80.setBackground(null);
        
            jButton81.setBackground(null);
        
            jButton82.setBackground(null);
       
            jButton83.setBackground(null);
        
            jButton86.setBackground(null);
        
            jButton87.setBackground(null);
        
            jButton88.setBackground(null);
        
            jButton89.setBackground(null);
        
            jButton90.setBackground(null);
        
            jButton91.setBackground(null);
        
            jButton92.setBackground(null);
        
            jButton93.setBackground(null);
       
            jButton94.setBackground(null);
        
            jButton95.setBackground(null);
        
            jButton96.setBackground(null);
        
            jButton97.setBackground(null);
       
            jButton100.setBackground(null);
        
            jButton101.setBackground(null);
        
            jButton102.setBackground(null);
        
            jButton103.setBackground(null);
       
            jButton104.setBackground(null);
        
            jButton105.setBackground(null);
        
            jButton106.setBackground(null);
        
            jButton107.setBackground(null);
        
            jButton108.setBackground(null);
        
            jButton109.setBackground(null);
        
            jButton110.setBackground(null);
        
            jButton111.setBackground(null);
        
            jButton114.setBackground(null);
        
            jButton115.setBackground(null);
        
            jButton116.setBackground(null);
        
            jButton117.setBackground(null);
        
            jButton108.setBackground(null);
        
            jButton109.setBackground(null);
       
            jButton110.setBackground(null);
        
            jButton111.setBackground(null);
        
            jButton114.setBackground(null);
        
            jButton115.setBackground(null);
        
            jButton116.setBackground(null);
       
            jButton117.setBackground(null);
        
            jButton118.setBackground(null);
        
            jButton119.setBackground(null);
        
            jButton120.setBackground(null);
        
            jButton121.setBackground(null);
       
            jButton122.setBackground(null);
        
            jButton123.setBackground(null);
        
            jButton124.setBackground(null);
       
            jButton125.setBackground(null);
        
            jButton128.setBackground(null);
      
            jButton129.setBackground(null);
        
            jButton130.setBackground(null);
       
            jButton131.setBackground(null);
        
            jButton132.setBackground(null);
       
            jButton133.setBackground(null);
      
            jButton134.setBackground(null);
       
            jButton135.setBackground(null);
        
            jButton136.setBackground(null);
        
            jButton137.setBackground(null);
        
            jButton138.setBackground(null);
        
            jButton139.setBackground(null);
      
        

        for(i=1;i<=155;i++)
        {
            for(j=1;j<=155;j++)
            {
               adjacency_matrix[i][j]= 0;
            }
        }    
   
        //matrix a connection kora
         int tag=14;
         for(i=1;i<=154;i++)
         {
            if(i<tag)
            {
                if(i>=141)
                {
                     adjacency_matrix[i][i+1]=1;
                     adjacency_matrix[i+1][i]=1;
                }
                else
                {
                    adjacency_matrix[i][i+1]=1;
                    adjacency_matrix[i+1][i]=1;
                    adjacency_matrix[i][i+14]=1;
                    adjacency_matrix[i+14][i]=1;
                    if(i<=141)
                    {
                        adjacency_matrix[i][i+15]=1;
                        adjacency_matrix[i+15][i]=1;
                        
                        adjacency_matrix[i+1][i+14]=1;
                        adjacency_matrix[i+14][i+1]=1;
                    }
                }
            }
            else
            {
                adjacency_matrix[i][i+14]=1;
                adjacency_matrix[i+14][i]=1;
                tag = i+14;
                
            }
         }
         
      jButton78.setBackground(Color.GREEN);
      
// Block initialize kora
      
           for(l=0;l<num2;l++)
           {
             int random = (int) (Math.random()*154);
             if((random >= 1 && random<=15) || (random >= 140 && random<=154) || random == 28 || random == 29 ||random == 42 ||random == 43 ||random == 56 ||random == 57 ||random == 70 ||random == 71 ||random == 84 ||random == 85 ||random == 98 ||random == 99 ||random == 112 ||random == 113 ||random == 126 ||random == 127 || random==78|| random==0|| random==63 ||random==64 ||random==65 ||random==77 ||random==79||random==91 ||random==92||random==93)
             {
                num2++;
             }
             else
             {
                 System.out.println("randommm=="+random);
                 adjacency_matrix[random][random+1]= 0;
                 adjacency_matrix[random+1][random]= 0;
                 adjacency_matrix[random][random-1]= 0;
                 adjacency_matrix[random-1][random]= 0;
                 adjacency_matrix[random][random-14]= 0;
                 adjacency_matrix[random-14][random]= 0;
                 adjacency_matrix[random][random+14]= 0;
                 adjacency_matrix[random+14][random]= 0;
        
                 adjacency_matrix[random][random-15]= 0;
                 adjacency_matrix[random-15][random]= 0;
                 adjacency_matrix[random][random+15]= 0;
                 adjacency_matrix[random+15][random]= 0;
                 adjacency_matrix[random][random-13]= 0;
                 adjacency_matrix[random-13][random]= 0;
                 adjacency_matrix[random][random+13]= 0;
                 adjacency_matrix[random+13][random]= 0;
                 
                 if(random ==16)
                 {
                    jButton16.setEnabled(false);
                     
                 }
                 else if(random ==17)
                 {
                    jButton17.setEnabled(false);
                 }
                 else if(random ==18)
                 {
                    jButton18.setEnabled(false);
                 }
                 else if(random ==19)
                 {
                    jButton19.setEnabled(false);
                 }
                 else if(random ==20)
                 {
                    jButton20.setEnabled(false);
                 }
                 else if(random ==21)
                 {
                    jButton21.setEnabled(false);
                 }
                 else if(random ==22)
                 {
                    jButton22.setEnabled(false);
                 }
                 else if(random ==23)
                 {
                    jButton23.setEnabled(false);
                 }
                 else if(random ==24)
                 {
                    jButton24.setEnabled(false);
                 }
                 else if(random ==25)
                 {
                    jButton25.setEnabled(false);
                 }
                 else if(random ==26)
                 {
                    jButton26.setEnabled(false);
                 }
                 else if(random ==27)
                 {
                    jButton27.setEnabled(false);
                 }
                 else if(random ==30)
                 {
                    jButton30.setEnabled(false);
                 }
                 else if(random ==31)
                 {
                    jButton31.setEnabled(false);
                 }
                 else if(random ==32)
                 {
                    jButton32.setEnabled(false);
                 }
                 else if(random ==33)
                 {
                    jButton33.setEnabled(false);
                 }
                 else if(random ==34)
                 {
                    jButton34.setEnabled(false);
                 }
                 else if(random ==35)
                 {
                    jButton35.setEnabled(false);
                 }
                 else if(random ==36)
                 {
                    jButton36.setEnabled(false);
                 }
                 else if(random ==37)
                 {
                    jButton37.setEnabled(false);
                 }
                 else if(random ==38)
                 {
                    jButton38.setEnabled(false);
                 }
                 else if(random ==39)
                 {
                    jButton39.setEnabled(false);
                 }
                 else if(random ==40)
                 {
                    jButton40.setEnabled(false);
                 }
                 else if(random ==41)
                 {
                    jButton41.setEnabled(false);
                 }
                 else if(random ==44)
                 {
                    jButton44.setEnabled(false);
                 }
                 else if(random ==45)
                 {
                    jButton45.setEnabled(false);
                 }
                 else if(random ==46)
                 {
                    jButton46.setEnabled(false);
                 }
                 else if(random ==47)
                 {
                    jButton47.setEnabled(false);
                 }
                 else if(random ==48)
                 {
                    jButton48.setEnabled(false);
                 }
                 else if(random ==49)
                 {
                    jButton49.setEnabled(false);
                 }
                 else if(random ==50)
                 {
                    jButton50.setEnabled(false);
                 }
                 else if(random ==51)
                 {
                    jButton51.setEnabled(false);
                 }
                 else if(random ==52)
                 {
                    jButton52.setEnabled(false);
                 }
                 else if(random ==53)
                 {
                    jButton53.setEnabled(false);
                 }
                 else if(random ==54)
                 {
                    jButton54.setEnabled(false);
                 }
                 else if(random ==55)
                 {
                    jButton55.setEnabled(false);
                 }
                 else if(random ==58)
                 {
                    jButton58.setEnabled(false);
                 }
                 else if(random ==59)
                 {
                    jButton59.setEnabled(false);
                 }
                 else if(random ==60)
                 {
                    jButton60.setEnabled(false);
                 }
                 else if(random ==61)
                 {
                    jButton61.setEnabled(false);
                 }
                 else if(random ==62)
                 {
                    jButton62.setEnabled(false);
                 }
                 else if(random ==63)
                 {
                    jButton63.setEnabled(false);
                 }
                 else if(random ==64)
                 {
                    jButton64.setEnabled(false);
                 }
                 else if(random ==65)
                 {
                    jButton65.setEnabled(false);
                 }
                 else if(random ==66)
                 {
                    jButton66.setEnabled(false);
                 }
                 else if(random ==67)
                 {
                    jButton67.setEnabled(false);
                 }
                 else if(random ==68)
                 {
                    jButton68.setEnabled(false);
                 }
                 else if(random ==69)
                 {
                    jButton69.setEnabled(false);
                 }
                 else if(random ==72)
                 {
                    jButton72.setEnabled(false);
                 }
                 else if(random ==73)
                 {
                    jButton73.setEnabled(false);
                 }
                 else if(random ==74)
                 {
                    jButton74.setEnabled(false);
                 }
                 else if(random ==75)
                 {
                    jButton75.setEnabled(false);
                 }
                 else if(random ==76)
                 {
                    jButton76.setEnabled(false);
                 }
                 else if(random ==77)
                 {
                    jButton77.setEnabled(false);
                 }
                 else if(random ==78)
                 {
                    jButton78.setEnabled(false);
                 }
                 else if(random ==79)
                 {
                    jButton79.setEnabled(false);
                 }
                 else if(random ==80)
                 {
                    jButton80.setEnabled(false);
                 }
                 else if(random ==81)
                 {
                    jButton81.setEnabled(false);
                 }
                 else if(random ==82)
                 {
                    jButton82.setEnabled(false);
                 }
                 else if(random ==83)
                 {
                    jButton83.setEnabled(false);
                 }
                 else if(random ==86)
                 {
                    jButton86.setEnabled(false);
                 }
                 else if(random ==87)
                 {
                    jButton87.setEnabled(false);
                 }
                 else if(random ==88)
                 {
                    jButton88.setEnabled(false);
                 }   
                 else if(random ==89)
                 {
                    jButton89.setEnabled(false);
                 }
                 else if(random ==90)
                 {
                    jButton90.setEnabled(false);
                 }
                 else if(random ==91)
                 {
                    jButton91.setEnabled(false);
                 }
                 else if(random ==92)
                 {
                    jButton92.setEnabled(false);
                 }
                 else if(random ==93)
                 {
                    jButton93.setEnabled(false);
                 }
                 else if(random ==94)
                 {
                    jButton94.setEnabled(false);
                 }
                 else if(random ==95)
                 {
                    jButton95.setEnabled(false);
                 }
                 else if(random ==96)
                 {
                    jButton96.setEnabled(false);
                 }
                 else if(random ==97)
                 {
                    jButton97.setEnabled(false);
                 }
                 else if(random ==100)
                 {
                    jButton100.setEnabled(false);
                 }
                 else if(random ==101)
                 {
                    jButton101.setEnabled(false);
                 }
                 else if(random ==102)
                 {
                    jButton102.setEnabled(false);
                 }
                 else if(random ==103)
                 {
                    jButton103.setEnabled(false);
                 }
                 else if(random ==104)
                 {
                    jButton104.setEnabled(false);
                 }
                 else if(random ==105)
                 {
                    jButton105.setEnabled(false);
                 }
                 else if(random ==106)
                 {
                    jButton106.setEnabled(false);
                 }
                 else if(random ==107)
                 {
                    jButton107.setEnabled(false);
                 }
                 else if(random ==108)
                 {
                    jButton108.setEnabled(false);
                 }
                 else if(random ==109)
                 {
                    jButton109.setEnabled(false);
                 }
                 else if(random ==110)
                 {
                    jButton110.setEnabled(false);
                 }
                 else if(random ==111)
                 {
                    jButton111.setEnabled(false);
                 }
                 else if(random ==114)
                 {
                    jButton114.setEnabled(false);
                 }
                 else if(random ==115)
                 {
                    jButton115.setEnabled(false);
                 }
                 else if(random ==116)
                 {
                    jButton116.setEnabled(false);
                 }
                 else if(random ==117)
                 {
                    jButton117.setEnabled(false);
                 }
                 else if(random ==108)
                 {
                    jButton108.setEnabled(false);
                 }
                 else if(random ==109)
                 {
                    jButton109.setEnabled(false);
                 }
                 else if(random ==110)
                 {
                    jButton110.setEnabled(false);
                 }
                 else if(random ==111)
                 {
                    jButton111.setEnabled(false);
                 }
                 else if(random ==114)
                 {
                    jButton114.setEnabled(false);
                 }
                 else if(random ==115)
                 {
                    jButton115.setEnabled(false);
                 }
                 else if(random ==116)
                 {
                    jButton116.setEnabled(false);
                 }
                 else if(random ==117)
                 {
                    jButton117.setEnabled(false);
                 }
                 else if(random ==118)
                 {
                    jButton118.setEnabled(false);
                 }
                 else if(random ==119)
                 {
                    jButton119.setEnabled(false);
                 }
                 else if(random ==120)
                 {
                    jButton120.setEnabled(false);
                 }
                 else if(random ==121)
                 {
                    jButton121.setEnabled(false);
                 }
                 else if(random ==122)
                 {
                    jButton122.setEnabled(false);
                 }
                 else if(random ==123)
                 {
                    jButton123.setEnabled(false);
                 }
                 else if(random ==124)
                 {
                    jButton124.setEnabled(false);
                 }
                 else if(random ==125)
                 {
                    jButton125.setEnabled(false);
                 }
                 else if(random ==128)
                 {
                    jButton128.setEnabled(false);
                 }
                 else if(random ==129)
                 {
                    jButton129.setEnabled(false);
                 }
                 else if(random ==130)
                 {
                    jButton130.setEnabled(false);
                 }
                 else if(random ==131)
                 {
                    jButton131.setEnabled(false);
                 }
                 else if(random ==132)
                 {
                    jButton132.setEnabled(false);
                 }
                 else if(random ==133)
                 {
                    jButton133.setEnabled(false);
                 }
                 else if(random ==134)
                 {
                    jButton134.setEnabled(false);
                 }
                 else if(random ==135)
                 {
                    jButton135.setEnabled(false);
                 }
                 else if(random ==136)
                 {
                    jButton136.setEnabled(false);
                 }
                 else if(random ==137)
                 {
                    jButton137.setEnabled(false);
                 }
                 else if(random ==138)
                 {
                    jButton138.setEnabled(false);
                 }
                 else if(random ==139)
                 {
                    jButton139.setEnabled(false);
                 }   
             }
         }
    }
    
    
    
    public void ColourTheNode(int ColourNode)
    {
        if(ColourNode ==16)
        {
           jButton16.setBackground(Color.GREEN);
           computerCount++;
        }
        else if(ColourNode ==17)
        {
            jButton17.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==18)
        {
            jButton18.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==19)
        {
            jButton19.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==20)
        {
            jButton20.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==21)
        {
            jButton21.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==22)
        {
            jButton22.setBackground(Color.GREEN);
            computerCount++;
        }
        else if(ColourNode ==23)
        {
            jButton23.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==24)
        {
            jButton24.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==25)
        {
            jButton25.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==26)
        {
            jButton26.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==27)
        {
            jButton27.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==30)
        {
            jButton30.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==31)
        {
            jButton31.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==32)
        {
            jButton32.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==33)
        {
            jButton33.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==34)
        {
            jButton34.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==35)
        {
            jButton35.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==36)
        {
            jButton36.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==37)
        {
            jButton37.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==38)
        {
            jButton38.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==39)
        {
            jButton39.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==40)
        {
            jButton40.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==41)
        {
            jButton41.setBackground(Color.GREEN);
            computerCount++;
        }
          else if(ColourNode ==44)
        {
            jButton44.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==45)
        {
            jButton45.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==46)
        {
            jButton46.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==47)
        {
            jButton47.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==48)
        {
            jButton48.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==49)
        {
            jButton49.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==50)
        {
            jButton50.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==51)
        {
            jButton51.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==52)
        {
            jButton52.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==53)
        {
            jButton53.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==54)
        {
            jButton54.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==55)
        {
            jButton55.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==58)
        {
            jButton58.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==59)
        {
            jButton59.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==60)
        {
            jButton60.setBackground(Color.GREEN);
            computerCount++;
        }
          else if(ColourNode ==61)
        {
            jButton61.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==62)
        {
            jButton62.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==63)
        {
            jButton63.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==64)
        {
            jButton64.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==65)
        {
            jButton65.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==66)
        {
            jButton66.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==67)
        {
            jButton67.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==68)
        {
            jButton68.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==69)
        {
            jButton69.setBackground(Color.GREEN);
            computerCount++;
        }
           else if(ColourNode ==72)
        {
            jButton72.setBackground(Color.GREEN);
            computerCount++;
        }
          else if(ColourNode ==73)
        {
            jButton73.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==74)
        {
            jButton74.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==75)
        {
            jButton75.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==76)
        {
            jButton76.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==77)
        {
            jButton77.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==78)
        {
            jButton78.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==79)
        {
            jButton79.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==80)
        {
            jButton80.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==81)
        {
            jButton81.setBackground(Color.GREEN);
            computerCount++;
        }
           else if(ColourNode ==82)
        {
            jButton82.setBackground(Color.GREEN);
            computerCount++;
        }
          else if(ColourNode ==83)
        {
            jButton83.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==86)
        {
            jButton86.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==87)
        {
            jButton87.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==88)
        {
            jButton88.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==89)
        {
            jButton89.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==90)
        {
            jButton90.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==91)
        {
            jButton91.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==92)
        {
            jButton92.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==93)
        {
            jButton93.setBackground(Color.GREEN);
            computerCount++;
        }
           else if(ColourNode ==94)
        {
            jButton94.setBackground(Color.GREEN);
            computerCount++;
        }
          else if(ColourNode ==95)
        {
            jButton95.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==96)
        {
            jButton96.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==97)
        {
            jButton97.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==100)
        {
            jButton100.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==101)
        {
            jButton101.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==102)
        {
            jButton102.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==103)
        {
            jButton103.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==104)
        {
            jButton104.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==105)
        {
            jButton105.setBackground(Color.GREEN);
            computerCount++;
        }
           else if(ColourNode ==106)
        {
            jButton106.setBackground(Color.GREEN);
            computerCount++;
        }
          else if(ColourNode ==107)
        {
            jButton107.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==108)
        {
            jButton108.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==109)
        {
            jButton109.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==110)
        {
            jButton110.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==111)
        {
            jButton111.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==114)
        {
            jButton114.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==115)
        {
            jButton115.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==116)
        {
            jButton116.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==117)
        {
            jButton117.setBackground(Color.GREEN);
            computerCount++;
        }
          else if(ColourNode ==108)
        {
            jButton108.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==109)
        {
            jButton109.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==110)
        {
            jButton110.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==111)
        {
            jButton111.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==114)
        {
            jButton114.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==115)
        {
            jButton115.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==116)
        {
            jButton116.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==117)
        {
            jButton117.setBackground(Color.GREEN);
            computerCount++;
        }
          else if(ColourNode ==118)
        {
            jButton118.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==119)
        {
            jButton119.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==120)
        {
            jButton120.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==121)
        {
            jButton121.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==122)
        {
            jButton122.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==123)
        {
            jButton123.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==124)
        {
            jButton124.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==125)
        {
            jButton125.setBackground(Color.GREEN);
            computerCount++;
        }
          else if(ColourNode ==128)
        {
            jButton128.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==129)
        {
            jButton129.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==130)
        {
            jButton130.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==131)
        {
            jButton131.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==132)
        {
            jButton132.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==133)
        {
            jButton133.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==134)
        {
            jButton134.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==135)
        {
            jButton135.setBackground(Color.GREEN);
            computerCount++;
        }
          else if(ColourNode ==136)
        {
            jButton136.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==137)
        {
            jButton137.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==138)
        {
            jButton138.setBackground(Color.GREEN);
            computerCount++;
        }
         else if(ColourNode ==139)
        {
            jButton139.setBackground(Color.GREEN);
            computerCount++;
        }
        else if((ColourNode >= 1 && ColourNode<=15) || (ColourNode >= 140 && ColourNode<=154) || ColourNode == 28 || ColourNode == 29 ||ColourNode == 42 ||ColourNode == 43 ||ColourNode == 56 ||ColourNode == 57 ||ColourNode == 70 ||ColourNode == 71 ||ColourNode == 84 ||ColourNode == 85 ||ColourNode == 98 ||ColourNode == 99 ||ColourNode == 112 ||ColourNode == 113 ||ColourNode == 126 ||ColourNode == 127)
        {
             System.out.println("Game OVER....Computer Win=="+computerCount);
             
             GameResult GameResult = new GameResult();
             String str = "Computer Reach The Red Line In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Computer Win");
             GameResult.setVisible(true);
             
        }
    }
    
    
    public void disColour (int a)
    {
        if(a ==16)
        {
           jButton16.setBackground(null);
           
        }
        else if(a ==17)
        {
            jButton17.setBackground(null);
        }
         else if(a ==18)
        {
            jButton18.setBackground(null);
        }
         else if(a ==19)
        {
            jButton19.setBackground(null);
        }
         else if(a ==20)
        {
            jButton20.setBackground(null);
        }
         else if(a ==21)
        {
            jButton21.setBackground(null);
        }
         else if(a ==22)
        {
            jButton22.setBackground(null);
        }
        else if(a ==23)
        {
            jButton23.setBackground(null);
        }
         else if(a ==24)
        {
            jButton24.setBackground(null);
        }
         else if(a ==25)
        {
            jButton25.setBackground(null);
        }
         else if(a ==26)
        {
            jButton26.setBackground(null);
        }
         else if(a ==27)
        {
            jButton27.setBackground(null);
        }
         else if(a ==30)
        {
            jButton30.setBackground(null);
        }
         else if(a ==31)
        {
            jButton31.setBackground(null);
        }
         else if(a ==32)
        {
            jButton32.setBackground(null);
        }
         else if(a ==33)
        {
            jButton33.setBackground(null);
        }
         else if(a ==34)
        {
            jButton34.setBackground(null);
        }
         else if(a ==35)
        {
            jButton35.setBackground(null);
        }
         else if(a ==36)
        {
            jButton36.setBackground(null);
        }
         else if(a ==37)
        {
            jButton37.setBackground(null);
        }
         else if(a ==38)
        {
            jButton38.setBackground(null);
        }
         else if(a ==39)
        {
            jButton39.setBackground(null);
        }
         else if(a ==40)
        {
            jButton40.setBackground(null);
        }
         else if(a ==41)
        {
            jButton41.setBackground(null);
        }
          else if(a ==44)
        {
            jButton44.setBackground(null);
        }
         else if(a ==45)
        {
            jButton45.setBackground(null);
        }
         else if(a ==46)
        {
            jButton46.setBackground(null);
        }
         else if(a ==47)
        {
            jButton47.setBackground(null);
        }
         else if(a ==48)
        {
            jButton48.setBackground(null);
        }
         else if(a ==49)
        {
            jButton49.setBackground(null);
        }
         else if(a ==50)
        {
            jButton50.setBackground(null);
        }
         else if(a ==51)
        {
            jButton51.setBackground(null);
        }
         else if(a ==52)
        {
            jButton52.setBackground(null);
        }
         else if(a ==53)
        {
            jButton53.setBackground(null);
        }
         else if(a ==54)
        {
            jButton54.setBackground(null);
        }
         else if(a ==55)
        {
            jButton55.setBackground(null);
        }
         else if(a ==58)
        {
            jButton58.setBackground(null);
        }
         else if(a ==59)
        {
            jButton59.setBackground(null);
        }
         else if(a ==60)
        {
            jButton60.setBackground(null);
        }
          else if(a ==61)
        {
            jButton61.setBackground(null);
        }
         else if(a ==62)
        {
            jButton62.setBackground(null);
        }
         else if(a ==63)
        {
            jButton63.setBackground(null);
        }
         else if(a ==64)
        {
            jButton64.setBackground(null);
        }
         else if(a ==65)
        {
            jButton65.setBackground(null);
        }
         else if(a ==66)
        {
            jButton66.setBackground(null);
        }
         else if(a ==67)
        {
            jButton67.setBackground(null);
        }
         else if(a ==68)
        {
            jButton68.setBackground(null);
        }
         else if(a ==69)
        {
            jButton69.setBackground(null);
        }
           else if(a ==72)
        {
            jButton72.setBackground(null);
        }
          else if(a ==73)
        {
            jButton73.setBackground(null);
        }
         else if(a ==74)
        {
            jButton74.setBackground(null);
        }
         else if(a ==75)
        {
            jButton75.setBackground(null);
        }
         else if(a ==76)
        {
            jButton76.setBackground(null);
        }
         else if(a ==77)
        {
            jButton77.setBackground(null);
        }
         else if(a ==78)
        {
            jButton78.setBackground(null);
        }
         else if(a ==79)
        {
            jButton79.setBackground(null);
        }
         else if(a ==80)
        {
            jButton80.setBackground(null);
        }
         else if(a ==81)
        {
            jButton81.setBackground(null);
        }
           else if(a ==82)
        {
            jButton82.setBackground(null);
        }
          else if(a ==83)
        {
            jButton83.setBackground(null);
        }
         else if(a ==86)
        {
            jButton86.setBackground(null);
        }
         else if(a ==87)
        {
            jButton87.setBackground(null);
        }
         else if(a ==88)
        {
            jButton88.setBackground(null);
        }
         else if(a ==89)
        {
            jButton89.setBackground(null);
        }
         else if(a ==90)
        {
            jButton90.setBackground(null);
        }
         else if(a ==91)
        {
            jButton91.setBackground(null);
        }
         else if(a ==92)
        {
            jButton92.setBackground(null);
        }
         else if(a ==93)
        {
            jButton93.setBackground(null);
        }
           else if(a ==94)
        {
            jButton94.setBackground(null);
        }
          else if(a ==95)
        {
            jButton95.setBackground(null);
        }
         else if(a ==96)
        {
            jButton96.setBackground(null);
        }
         else if(a ==97)
        {
            jButton97.setBackground(null);
        }
         else if(a ==100)
        {
            jButton100.setBackground(null);
        }
         else if(a ==101)
        {
            jButton101.setBackground(null);
        }
         else if(a ==102)
        {
            jButton102.setBackground(null);
        }
         else if(a ==103)
        {
            jButton103.setBackground(null);
        }
         else if(a ==104)
        {
            jButton104.setBackground(null);
        }
         else if(a ==105)
        {
            jButton105.setBackground(null);
        }
           else if(a ==106)
        {
            jButton106.setBackground(null);
        }
          else if(a ==107)
        {
            jButton107.setBackground(null);
        }
         else if(a ==108)
        {
            jButton108.setBackground(null);
        }
         else if(a ==109)
        {
            jButton109.setBackground(null);
        }
         else if(a ==110)
        {
            jButton110.setBackground(null);
        }
         else if(a ==111)
        {
            jButton111.setBackground(null);
        }
         else if(a ==114)
        {
            jButton114.setBackground(null);
        }
         else if(a ==115)
        {
            jButton115.setBackground(null);
        }
         else if(a ==116)
        {
            jButton116.setBackground(null);
        }
         else if(a ==117)
        {
            jButton117.setBackground(null);
        }
          else if(a ==108)
        {
            jButton108.setBackground(null);
        }
         else if(a ==109)
        {
            jButton109.setBackground(null);
        }
         else if(a ==110)
        {
            jButton110.setBackground(null);
        }
         else if(a ==111)
        {
            jButton111.setBackground(null);
        }
         else if(a ==114)
        {
            jButton114.setBackground(null);
        }
         else if(a ==115)
        {
            jButton115.setBackground(null);
        }
         else if(a ==116)
        {
            jButton116.setBackground(null);
        }
         else if(a ==117)
        {
            jButton117.setBackground(null);
        }
          else if(a ==118)
        {
            jButton118.setBackground(null);
        }
         else if(a ==119)
        {
            jButton119.setBackground(null);
        }
         else if(a ==120)
        {
            jButton120.setBackground(null);
        }
         else if(a ==121)
        {
            jButton121.setBackground(null);
        }
         else if(a ==122)
        {
            jButton122.setBackground(null);
        }
         else if(a ==123)
        {
            jButton123.setBackground(null);
        }
         else if(a ==124)
        {
            jButton124.setBackground(null);
        }
         else if(a ==125)
        {
            jButton125.setBackground(null);
        }
          else if(a ==128)
        {
            jButton128.setBackground(null);
        }
         else if(a ==129)
        {
            jButton129.setBackground(null);
        }
         else if(a ==130)
        {
            jButton130.setBackground(null);
        }
         else if(a ==131)
        {
            jButton131.setBackground(null);
        }
         else if(a ==132)
        {
            jButton132.setBackground(null);
        }
         else if(a ==133)
        {
            jButton133.setBackground(null);
        }
         else if(a ==134)
        {
            jButton134.setBackground(null);
        }
         else if(a ==135)
        {
            jButton135.setBackground(null);
        }
          else if(a ==136)
        {
            jButton136.setBackground(null);
        }
         else if(a ==137)
        {
            jButton137.setBackground(null);
        }
         else if(a ==138)
        {
            jButton138.setBackground(null);
        }
         else if(a ==139)
        {
            jButton139.setBackground(null);
        }
        
    }
    
    public void Printpath(int V) {
        if (start == V) {
            System.out.print("" + start);
        } else if (par[V] == 0) {
            if (BfsTag == 1 && count < 110) {
                BfsTag = 0;
                againtag = 1;
            } else if (BfsTag == 0 && count < 110) {
                BfsTag = 1;

            }
            System.out.println("No path exist");
            count = 110;
        } else {
            Printpath(par[V]);
            System.out.print("--> " + V);
        }
        count++;
        if (count == 3) {
            path = par[V];
            tag2 = 1;
        } else if ((count == 2) && tag2 == 0) {
            path = V;
        }
    }
    public void bfs(int ux) {
        int vx, i;
        color[ux] = 1;
        par[ux] = 0;
        cost[ux] = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(ux);
        while (!q.isEmpty()) {
            vx = q.peek();
            q.poll();
            for (i = start; i <= node; i++) {
                if (adjacency_matrix[vx][i] == 1 && color[i] == 0) {
                    color[i] = 1;
                    q.add(i);
                    par[i] = vx;
                    cost[i] = cost[vx] + 1;
                }

            }

        }

        //System.out.println(""+adjacency_matrix[0][1]+" ux= "+ux);
    }
public void ReverseBfs(int ux)
    {
        int vx,i;
        color[ux]=1;
        par[ux]=0;
        cost[ux]=0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(ux);
        while (!q.isEmpty()) {
            vx= q.peek();
            q.poll();
            for(i=start;i>=node2;i--)
            {
            if(adjacency_matrix[vx][i]==1 && color[i]==0)
            {
                color[i]=1;
                q.add(i);
                par[i]=vx;
                cost[i] = cost[vx]+1;
            }
             
            }
  
        }
        //System.out.println(""+adjacency_matrix[0][1]+" ux= "+ux);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();
        jButton104 = new javax.swing.JButton();
        jButton105 = new javax.swing.JButton();
        jButton106 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        jButton108 = new javax.swing.JButton();
        jButton109 = new javax.swing.JButton();
        jButton110 = new javax.swing.JButton();
        jButton111 = new javax.swing.JButton();
        jButton112 = new javax.swing.JButton();
        jButton113 = new javax.swing.JButton();
        jButton114 = new javax.swing.JButton();
        jButton115 = new javax.swing.JButton();
        jButton116 = new javax.swing.JButton();
        jButton117 = new javax.swing.JButton();
        jButton118 = new javax.swing.JButton();
        jButton119 = new javax.swing.JButton();
        jButton120 = new javax.swing.JButton();
        jButton121 = new javax.swing.JButton();
        jButton122 = new javax.swing.JButton();
        jButton123 = new javax.swing.JButton();
        jButton124 = new javax.swing.JButton();
        jButton125 = new javax.swing.JButton();
        jButton126 = new javax.swing.JButton();
        jButton127 = new javax.swing.JButton();
        jButton128 = new javax.swing.JButton();
        jButton129 = new javax.swing.JButton();
        jButton130 = new javax.swing.JButton();
        jButton131 = new javax.swing.JButton();
        jButton132 = new javax.swing.JButton();
        jButton133 = new javax.swing.JButton();
        jButton134 = new javax.swing.JButton();
        jButton135 = new javax.swing.JButton();
        jButton136 = new javax.swing.JButton();
        jButton137 = new javax.swing.JButton();
        jButton138 = new javax.swing.JButton();
        jButton139 = new javax.swing.JButton();
        jButton140 = new javax.swing.JButton();
        jButton141 = new javax.swing.JButton();
        jButton142 = new javax.swing.JButton();
        jButton143 = new javax.swing.JButton();
        jButton144 = new javax.swing.JButton();
        jButton145 = new javax.swing.JButton();
        jButton146 = new javax.swing.JButton();
        jButton147 = new javax.swing.JButton();
        jButton148 = new javax.swing.JButton();
        jButton149 = new javax.swing.JButton();
        jButton150 = new javax.swing.JButton();
        jButton151 = new javax.swing.JButton();
        jButton152 = new javax.swing.JButton();
        jButton153 = new javax.swing.JButton();
        jButton154 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        New_Game = new javax.swing.JButton();
        jButton156 = new javax.swing.JButton();
        jButton157 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Block The Green");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));

        jButton5.setBackground(new java.awt.Color(255, 0, 0));

        jButton6.setBackground(new java.awt.Color(255, 0, 0));

        jButton7.setBackground(new java.awt.Color(255, 0, 0));

        jButton8.setBackground(new java.awt.Color(255, 0, 0));

        jButton9.setBackground(new java.awt.Color(255, 0, 0));

        jButton10.setBackground(new java.awt.Color(255, 0, 0));

        jButton11.setBackground(new java.awt.Color(255, 0, 0));

        jButton12.setBackground(new java.awt.Color(255, 0, 0));

        jButton13.setBackground(new java.awt.Color(255, 0, 0));

        jButton14.setBackground(new java.awt.Color(255, 0, 0));

        jButton15.setBackground(new java.awt.Color(255, 0, 0));

        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(255, 0, 0));

        jButton29.setBackground(new java.awt.Color(255, 0, 0));

        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setBackground(new java.awt.Color(255, 0, 0));

        jButton43.setBackground(new java.awt.Color(255, 0, 0));

        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton56.setBackground(new java.awt.Color(255, 0, 0));

        jButton57.setBackground(new java.awt.Color(255, 0, 0));

        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });

        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });

        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });

        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });

        jButton70.setBackground(new java.awt.Color(255, 0, 0));

        jButton71.setBackground(new java.awt.Color(255, 0, 0));

        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });

        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });

        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });

        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });

        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });

        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });

        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });

        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });

        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });

        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });

        jButton84.setBackground(new java.awt.Color(255, 0, 0));

        jButton85.setBackground(new java.awt.Color(255, 0, 0));

        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });

        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });

        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });

        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });

        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });

        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });

        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });

        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });

        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });

        jButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton95ActionPerformed(evt);
            }
        });

        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });

        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });

        jButton98.setBackground(new java.awt.Color(255, 0, 0));

        jButton99.setBackground(new java.awt.Color(255, 0, 0));

        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });

        jButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton101ActionPerformed(evt);
            }
        });

        jButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton102ActionPerformed(evt);
            }
        });

        jButton103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton103ActionPerformed(evt);
            }
        });

        jButton104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton104ActionPerformed(evt);
            }
        });

        jButton105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton105ActionPerformed(evt);
            }
        });

        jButton106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton106ActionPerformed(evt);
            }
        });

        jButton107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton107ActionPerformed(evt);
            }
        });

        jButton108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton108ActionPerformed(evt);
            }
        });

        jButton109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton109ActionPerformed(evt);
            }
        });

        jButton110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton110ActionPerformed(evt);
            }
        });

        jButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton111ActionPerformed(evt);
            }
        });

        jButton112.setBackground(new java.awt.Color(255, 0, 0));

        jButton113.setBackground(new java.awt.Color(255, 0, 0));

        jButton114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton114ActionPerformed(evt);
            }
        });

        jButton115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton115ActionPerformed(evt);
            }
        });

        jButton116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton116ActionPerformed(evt);
            }
        });

        jButton117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton117ActionPerformed(evt);
            }
        });

        jButton118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton118ActionPerformed(evt);
            }
        });

        jButton119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton119ActionPerformed(evt);
            }
        });

        jButton120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton120ActionPerformed(evt);
            }
        });

        jButton121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton121ActionPerformed(evt);
            }
        });

        jButton122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton122ActionPerformed(evt);
            }
        });

        jButton123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton123ActionPerformed(evt);
            }
        });

        jButton124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton124ActionPerformed(evt);
            }
        });

        jButton125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton125ActionPerformed(evt);
            }
        });

        jButton126.setBackground(new java.awt.Color(255, 0, 0));

        jButton127.setBackground(new java.awt.Color(255, 0, 0));

        jButton128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton128ActionPerformed(evt);
            }
        });

        jButton129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton129ActionPerformed(evt);
            }
        });

        jButton130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton130ActionPerformed(evt);
            }
        });

        jButton131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton131ActionPerformed(evt);
            }
        });

        jButton132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton132ActionPerformed(evt);
            }
        });

        jButton133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton133ActionPerformed(evt);
            }
        });

        jButton134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton134ActionPerformed(evt);
            }
        });

        jButton135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton135ActionPerformed(evt);
            }
        });

        jButton136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton136ActionPerformed(evt);
            }
        });

        jButton137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton137ActionPerformed(evt);
            }
        });

        jButton138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton138ActionPerformed(evt);
            }
        });

        jButton139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton139ActionPerformed(evt);
            }
        });

        jButton140.setBackground(new java.awt.Color(255, 0, 0));

        jButton141.setBackground(new java.awt.Color(255, 0, 0));

        jButton142.setBackground(new java.awt.Color(255, 0, 0));

        jButton143.setBackground(new java.awt.Color(255, 0, 0));

        jButton144.setBackground(new java.awt.Color(255, 0, 0));

        jButton145.setBackground(new java.awt.Color(255, 0, 0));

        jButton146.setBackground(new java.awt.Color(255, 0, 0));

        jButton147.setBackground(new java.awt.Color(255, 0, 0));

        jButton148.setBackground(new java.awt.Color(255, 0, 0));

        jButton149.setBackground(new java.awt.Color(255, 0, 0));

        jButton150.setBackground(new java.awt.Color(255, 0, 0));

        jButton151.setBackground(new java.awt.Color(255, 0, 0));

        jButton152.setBackground(new java.awt.Color(255, 0, 0));

        jButton153.setBackground(new java.awt.Color(255, 0, 0));

        jButton154.setBackground(new java.awt.Color(255, 0, 0));
        jButton154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton154ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton141, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jButton127, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton113, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton99, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton85, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton71, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton57, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton128, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton142, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton129, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton143, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton116, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton130, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton144, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton131, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton145, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton132, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton146, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton105, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton119, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton133, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton147, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton120, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton134, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton148, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton121, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton135, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton149, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton122, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton136, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton150, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton123, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton137, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton151, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton110, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton124, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton138, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton152, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton125, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton139, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton153, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton70, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton126, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton140, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton154, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton119, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton120, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton125, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton126, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton128, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton129, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton130, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton133, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton135, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton137, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton138, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton139, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton140, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton127, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton141, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton142, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton143, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton144, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton145, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton146, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton147, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton148, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton149, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton150, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton151, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton152, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton153, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton154, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        New_Game.setText("START  GAME");
        New_Game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_GameActionPerformed(evt);
            }
        });

        jButton156.setText("GAME CREDIT");
        jButton156.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton156ActionPerformed(evt);
            }
        });

        jButton157.setText("INSTRUCTION");
        jButton157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton157ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText(" BLOCK THE GREEN");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Easy", "Normal", "Hard" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton157, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton156, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(New_Game, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(New_Game, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton156, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton157, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void New_GameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_GameActionPerformed
        try{
        if(select.equals("Easy"))
        {
            num2 = 35;
        }
       else if(select.equals("Normal"))
        {
            num2 = 25;
        }
       else if(select.equals("Hard"))
        {
            num2= 18;
        }
        FirstRun();
        }
        catch(Exception e)
        {
            Error_message error = new Error_message();
            error.show();
        }
    }//GEN-LAST:event_New_GameActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        music();
        r= 40;
        c= 39;
        b= 41;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        
        if(BfsTag == 0)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;   
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton40.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton121ActionPerformed
        music();
        r= 121;
        c= 120;
        b= 122;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
           if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton121.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton121ActionPerformed

    private void jButton120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton120ActionPerformed
        music();
        r= 120;
        c= 119;
        b= 121;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton120.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton120ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        music();
        r= 16;
        c= 15;
        b= 17;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
           if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton16.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        music();
        r= 78;
        c= 77;
        b= 79;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
       shortCount= 100;
        ColourTheNode(start2);
       jButton78.setEnabled(false);
       if(start2 != start)
        {
            disColour(start);
        }
       else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        music();
        r= 17;
        c= 16;
        b= 18;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton17.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        music();        
        r= 18;
        c= 17;
        b= 19;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton18.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        music();
        r= 19;
        c= 18;
        b= 20;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton19.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        music();
        r= 20;
        c= 19;
        b= 21;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton20.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        music();
        r= 21;
        c= 20;
        b= 22;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
       ColourTheNode(start2);
       jButton21.setEnabled(false);
       if(start2 != start)
        {
            disColour(start);
        }
       else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        music();
        r= 22;
        c= 21;
        b= 23;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton22.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        music();
        r= 23;
        c= 22;
        b= 24;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton23.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        music();
        r= 24;
        c= 23;
        b= 25;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton24.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        music();
        r= 25;
        c= 24;
        b= 26;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton25.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        music();
        r= 26;
        c= 25;
        b= 27;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton26.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        music();
        r= 27;
        c= 26;
        b= 28;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton27.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        music();
        r= 30;
        c= 29;
        b= 31;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
       ColourTheNode(start2);
       jButton30.setEnabled(false);
       if(start2 != start)
        {
            disColour(start);
        }
       else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        music();
        r= 31;
        c= 30;
        b= 32;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton31.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        music();
        r= 32;
        c= 31;
        b= 33;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
       ColourTheNode(start2);
       jButton32.setEnabled(false);
       if(start2 != start)
        {
            disColour(start);
        }
       else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        music();
        r= 33;
        c= 32;
        b= 34;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton33.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        music();
        r= 34;
        c= 33;
        b= 35;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton34.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        music();
        r= 35;
        c= 34;
        b= 36;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton35.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        music();
        r= 36;
        c= 35;
        b= 37;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton36.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        music();
        r= 37;
        c= 36;
        b= 38;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton37.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        music();
        r= 38;
        c= 37;
        b= 39;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton38.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        music();
        r= 39;
        c= 38;
        b= 40;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
       ColourTheNode(start2);
       jButton39.setEnabled(false);
       if(start2 != start)
        {
            disColour(start);
        }
       else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        music();
        r= 41;
        c= 40;
        b= 42;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton41.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        music();
        r= 44;
        c= 43;
        b= 45;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
       ColourTheNode(start2);
       jButton44.setEnabled(false);
       if(start2 != start)
        {
            disColour(start);
        }
       else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        music();
        r= 45;
        c= 44;
        b= 46;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
       ColourTheNode(start2);
       jButton45.setEnabled(false);
       if(start2 != start)
        {
            disColour(start);
        }
       else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        music();
        r= 46;
        c= 45;
        b= 47;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton46.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        music();
        r= 47;
        c= 46;
        b= 48;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton47.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        music();
        r= 48;
        c= 47;
        b= 49;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton48.setEnabled(false);
       if(start2 != start)
        {
            disColour(start);
        }
       else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        music();
        r= 49;
        c= 48;
        b= 50;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton49.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        music();
        r= 50;
        c= 49;
        b= 51;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton50.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        music();
        r= 51;
        c= 50;
        b= 52;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton51.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        music();
        r= 52;
        c= 51;
        b= 53;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton52.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        music();
        r= 53;
        c= 52;
        b= 54;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton53.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        music();
        r= 54;
        c= 53;
        b= 55;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton54.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        music();
        r= 55;
        c= 54;
        b= 56;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton55.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        music();
        r= 58;
        c= 57;
        b= 59;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton58.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        music();
        r= 59;
        c= 58;
        b= 60;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton59.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        music();
        r= 60;
        c= 59;
        b= 61;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
       ColourTheNode(start2);
       jButton60.setEnabled(false);
       if(start2 != start)
        {
            disColour(start);
        }
       else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        music();
        r= 61;
        c= 60;
        b= 62;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton61.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        music();
        r= 62;
        c= 61;
        b= 63;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
     if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
     shortCount= 100;
     for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton62.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        music();
        r= 63;
        c= 62;
        b= 64;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        HumanCount++;
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton63.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        music();
        r= 64;
        c= 63;
        b= 65;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton64.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        music();
        r= 65;
        c= 64;
        b= 66;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton65.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        music();
        r= 66;
        c= 65;
        b= 67;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton66.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        music();
        r= 67;
        c= 66;
        b= 68;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton67.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        music();
        r= 68;
        c= 67;
        b= 69;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton68.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        music();
        r= 69;
        c= 68;
        b= 70;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton69.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        music();
        r= 72;
        c= 71;
        b= 73;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton72.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        music();
        r= 73;
        c= 72;
        b= 74;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton73.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        music();
        r= 74;
        c= 73;
        b= 75;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton74.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        music();
        r= 75;
        c= 74;
        b= 76;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton75.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        music();
        r= 76;
        c= 75;
        b= 77;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton76.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        music();
        r= 77;
        c= 76;
        b= 78;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton77.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        music();
        r= 79;
        c= 78;
        b= 80;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton79.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        music();
        r= 80;
        c= 79;
        b= 81;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton80.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        music();
        r= 81;
        c= 80;
        b= 82;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton81.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        music();
        r= 82;
        c= 81;
        b= 83;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton82.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        music();
        r= 83;
        c= 82;
        b= 84;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton83.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        music();
        r= 86;
        c= 85;
        b= 87;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton86.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        music();
        r= 87;
        c= 86;
        b= 88;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton87.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        music();
        r= 88;
        c= 87;
        b= 89;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton88.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        music();
        r= 89;
        c= 88;
        b= 90;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton89.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        music();
        r= 90;
        c= 89;
        b= 91;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton90.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        music();
        r= 91;
        c= 90;
        b= 92;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton91.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        music();
        r= 92;
        c= 91;
        b= 93;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton92.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        music();
        r= 93;
        c= 92;
        b= 94;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton93.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        music();
        r= 94;
        c= 93;
        b= 95;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton94.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed
        music();
        r= 95;
        c= 94;
        b= 96;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton95.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
        music();
        r= 96;
        c= 95;
        b= 97;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton96.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton96ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
        music();
        r= 97;
        c= 96;
        b= 98;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton97.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
        music();
        r= 100;
        c= 99;
        b= 101;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton100.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton100ActionPerformed

    private void jButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton101ActionPerformed
        music();
        r= 101;
        c= 100;
        b= 102;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton101.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton101ActionPerformed

    private void jButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton102ActionPerformed
        music();
        r= 102;
        c= 101;
        b= 103;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton102.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton102ActionPerformed

    private void jButton103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton103ActionPerformed
        music();
        r= 103;
        c= 102;
        b= 104;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton103.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton103ActionPerformed

    private void jButton104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton104ActionPerformed
        music();
        r= 104;
        c= 103;
        b= 105;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton104.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton104ActionPerformed

    private void jButton105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton105ActionPerformed
        music();
        r= 105;
        c= 104;
        b= 106;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton105.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton105ActionPerformed

    private void jButton106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton106ActionPerformed
        music();
        r= 106;
        c= 105;
        b= 107;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton106.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton106ActionPerformed

    private void jButton107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton107ActionPerformed
        music();
        r= 107;
        c= 106;
        b= 108;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton107.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton107ActionPerformed

    private void jButton108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton108ActionPerformed
        music();
        r= 108;
        c= 107;
        b= 109;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton108.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton108ActionPerformed

    private void jButton109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton109ActionPerformed
        music();
        r= 109;
        c= 108;
        b= 110;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton109.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton109ActionPerformed

    private void jButton110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton110ActionPerformed
        music();
        r= 110;
        c= 109;
        b= 111;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton110.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton110ActionPerformed

    private void jButton111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton111ActionPerformed
        music();
        r= 111;
        c= 110;
        b= 112;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton111.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton111ActionPerformed

    private void jButton114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton114ActionPerformed
        music();
        r= 114;
        c= 113;
        b= 115;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton114.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton114ActionPerformed

    private void jButton115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton115ActionPerformed
        music();
        r= 115;
        c= 114;
        b= 116;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton115.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton115ActionPerformed

    private void jButton116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton116ActionPerformed
        music();
        r= 116;
        c= 115;
        b= 117;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton116.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton116ActionPerformed

    private void jButton117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton117ActionPerformed
        music();
        r= 117;
        c= 116;
        b= 118;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton117.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton117ActionPerformed

    private void jButton118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton118ActionPerformed
        music();
        r= 118;
        c= 117;
        b= 119;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton118.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton118ActionPerformed

    private void jButton119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton119ActionPerformed
        music();
        r= 119;
        c= 118;
        b= 120;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        System.out.println("afdaf="+adjacency_matrix[104][105]);
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton119.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton119ActionPerformed

    private void jButton122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton122ActionPerformed
        music();
        r= 122;
        c= 121;
        b= 123;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton122.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton122ActionPerformed

    private void jButton123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton123ActionPerformed
        music();
        r= 123;
        c= 122;
        b= 124;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton123.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton123ActionPerformed

    private void jButton124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton124ActionPerformed
        music();
        r= 124;
        c= 123;
        b= 125;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton124.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton124ActionPerformed

    private void jButton125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton125ActionPerformed
        music();
        r= 125;
        c= 124;
        b= 126;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton125.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton125ActionPerformed

    private void jButton128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton128ActionPerformed
        music();
        r= 128;
        c= 127;
        b= 129;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton128.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton128ActionPerformed

    private void jButton129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton129ActionPerformed
        music();
        r= 129;
        c= 128;
        b= 130;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
      if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
      shortCount= 100;
      for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton129.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton129ActionPerformed

    private void jButton130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton130ActionPerformed
        music();
        r= 130;
        c= 129;
        b= 131;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton130.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton130ActionPerformed

    private void jButton131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton131ActionPerformed
        music();
        r= 131;
        c= 130;
        b= 132;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton131.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton131ActionPerformed

    private void jButton132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton132ActionPerformed
        music();
        r= 132;
        c= 131;
        b= 133;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton132.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton132ActionPerformed

    private void jButton133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton133ActionPerformed
        music();
        r= 133;
        c= 132;
        b= 134;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton133.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton133ActionPerformed

    private void jButton134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton134ActionPerformed
        music();
        r= 134;
        c= 133;
        b= 135;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
         jButton134.setEnabled(false);
         if(start2 != start)
        {
            disColour(start);
        }
         else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton134ActionPerformed

    private void jButton135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton135ActionPerformed
        music();
        r= 135;
        c= 134;
        b= 136;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
         jButton135.setEnabled(false);
         if(start2 != start)
        {
            disColour(start);
        }
         else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton135ActionPerformed

    private void jButton136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton136ActionPerformed
        music();
        r= 136;
        c= 135;
        b= 137;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
         jButton136.setEnabled(false);
         if(start2 != start)
        {
            disColour(start);
        }
         else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton136ActionPerformed

    private void jButton137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton137ActionPerformed
        music();
        r= 137;
        c= 136;
        b= 138;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
         jButton137.setEnabled(false);
         if(start2 != start)
        {
            disColour(start);
        }
         else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton137ActionPerformed

    private void jButton138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton138ActionPerformed
        music();
        r= 138;
        c= 137;
        b= 139;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
        shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
         jButton138.setEnabled(false);
         if(start2 != start)
        {
            disColour(start);
        }
         else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton138ActionPerformed

    private void jButton139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton139ActionPerformed
        music();
        r= 139;
        c= 138;
        b= 140;
        adjacency_matrix[r][c]= 0;
        adjacency_matrix[c][r]= 0;
        adjacency_matrix[r][b]= 0;
        adjacency_matrix[b][r]= 0;
        adjacency_matrix[r][r-14]= 0;
        adjacency_matrix[r-14][r]= 0;
        adjacency_matrix[r][r+14]= 0;
        adjacency_matrix[r+14][r]= 0;
        
        adjacency_matrix[r][r-15]= 0;
        adjacency_matrix[r-15][r]= 0;
        adjacency_matrix[r][r+15]= 0;
        adjacency_matrix[r+15][r]= 0;
        adjacency_matrix[r][r-13]= 0;
        adjacency_matrix[r-13][r]= 0;
        adjacency_matrix[r][r+13]= 0;
        adjacency_matrix[r+13][r]= 0;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
       if(BfsTag==0)
        {
        if(tag==0)
        {
            start=78;
            bfs(start);
            tag=1;
        }
        else
        {
            start=start2;
            bfs(start);
        }
        
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    System.out.println("shortCount= "+shortCount);
                    System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
       shortCount= 100;
       for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 1)
        {
            if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            ReverseBfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]<start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
        }
         shortCount= 100;
        for(k=0;k<250;k++)
        {
            cost[k]=0;
            par[k]=0;
            color[k]=0;
        }
        if(BfsTag == 0 && againtag==1)
        {
          if(tag==0)
          {
            start=78;
            bfs(start);
            tag=1;
          }
          else
          {
            start=start2;
            bfs(start);
          }
        for(p=1;p<=46;p++)
        {
            if(endPoint[p]>start)
            {
                Printpath(endPoint[p]);
                if(count<shortCount)
                {
                    shortCount= count;
                    //System.out.println("shortCount= "+shortCount);
                    //System.out.println("Path= "+path);
                    start2=path;
                    count=0;
                    
                }
                count=0;
                
                System.out.println("");

            }
        }
            againtag=0;
        }
        tag2=0;
        shortCount= 100;
        ColourTheNode(start2);
        jButton139.setEnabled(false);
        if(start2 != start)
        {
            disColour(start);
        }
        else if(start==start2)
        {
             GameResult GameResult = new GameResult();
             String str = "Human Block The Green In ";
             String str1 = Integer.toString(computerCount);
             String str2 = " Steps.";
             String new_Str = str.concat(str1);
             str=new_Str.concat(str2);
             GameResult.Human.setText(str);
             GameResult.Win.setText("Human Win");
             GameResult.setVisible(true);
        }
    }//GEN-LAST:event_jButton139ActionPerformed

    private void jButton154ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton154ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton154ActionPerformed

    private void jButton156ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton156ActionPerformed
        GameCredit credit = new GameCredit();
        credit.show();
    }//GEN-LAST:event_jButton156ActionPerformed

    private void jButton157ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton157ActionPerformed
        Instruction ins = new Instruction();
        ins.show();
    }//GEN-LAST:event_jButton157ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        select = jComboBox1.getSelectedItem().toString();
        //System.out.println(""+select);
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainDesign().setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton New_Game;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    private javax.swing.JButton jButton105;
    private javax.swing.JButton jButton106;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton108;
    private javax.swing.JButton jButton109;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton110;
    private javax.swing.JButton jButton111;
    private javax.swing.JButton jButton112;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton115;
    private javax.swing.JButton jButton116;
    private javax.swing.JButton jButton117;
    private javax.swing.JButton jButton118;
    private javax.swing.JButton jButton119;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton120;
    private javax.swing.JButton jButton121;
    private javax.swing.JButton jButton122;
    private javax.swing.JButton jButton123;
    private javax.swing.JButton jButton124;
    private javax.swing.JButton jButton125;
    private javax.swing.JButton jButton126;
    private javax.swing.JButton jButton127;
    private javax.swing.JButton jButton128;
    private javax.swing.JButton jButton129;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton130;
    private javax.swing.JButton jButton131;
    private javax.swing.JButton jButton132;
    private javax.swing.JButton jButton133;
    private javax.swing.JButton jButton134;
    private javax.swing.JButton jButton135;
    private javax.swing.JButton jButton136;
    private javax.swing.JButton jButton137;
    private javax.swing.JButton jButton138;
    private javax.swing.JButton jButton139;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton140;
    private javax.swing.JButton jButton141;
    private javax.swing.JButton jButton142;
    private javax.swing.JButton jButton143;
    private javax.swing.JButton jButton144;
    private javax.swing.JButton jButton145;
    private javax.swing.JButton jButton146;
    private javax.swing.JButton jButton147;
    private javax.swing.JButton jButton148;
    private javax.swing.JButton jButton149;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton150;
    private javax.swing.JButton jButton151;
    private javax.swing.JButton jButton152;
    private javax.swing.JButton jButton153;
    private javax.swing.JButton jButton154;
    private javax.swing.JButton jButton156;
    private javax.swing.JButton jButton157;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Insertion_Sort.Insertion_Sort;
import Bubble_Sort.Bubble_Sort;
import Merge_sort.Merge_Sort;
import com.mathworks.engine.EngineException;
import com.mathworks.engine.MatlabEngine;
import com.mathworks.engine.MatlabSyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author Shavnil Kumar
 */
public final class Main extends javax.swing.JFrame {

    //declaring ArrayList  
    ArrayList<Data> Book_ArrayList = new ArrayList<>();
    ArrayList<Data> A_bookID = new ArrayList<>();
    ArrayList<Data> A_title = new ArrayList<>();
    ArrayList<Data> A_authors = new ArrayList<>();
    ArrayList<Data> A_average_rating = new ArrayList<>();
    ArrayList<Data> A_isbn = new ArrayList<>();
    ArrayList<Data> A_isbn13 = new ArrayList<>();
    ArrayList<Data> A_language_code = new ArrayList<>();
    ArrayList<Data> A_num_pages = new ArrayList<>();
    ArrayList<Data> A_ratings_count = new ArrayList<>();
    ArrayList<Data> A_text_reviews_count = new ArrayList<>();
    ArrayList<Data> A_publication_date = new ArrayList<>();
    ArrayList<Data> A_publisher = new ArrayList<>();

    //declaring LinkedList  
    LinkedList<Data> Book_LinkedList = new LinkedList<>();
    LinkedList<Data> L_bookID = new LinkedList<>();
    LinkedList<Data> L_title = new LinkedList<>();
    LinkedList<Data> L_authors = new LinkedList<>();
    LinkedList<Data> L_average_rating = new LinkedList<>();
    LinkedList<Data> L_isbn = new LinkedList<>();
    LinkedList<Data> L_isbn13 = new LinkedList<>();
    LinkedList<Data> L_language_code = new LinkedList<>();
    LinkedList<Data> L_num_pages = new LinkedList<>();
    LinkedList<Data> L_ratings_count = new LinkedList<>();
    LinkedList<Data> L_text_reviews_count = new LinkedList<>();
    LinkedList<Data> L_publication_date = new LinkedList<>();
    LinkedList<Data> L_publisher = new LinkedList<>();

    //Insertion sort with Arraylist and LinkedList
    Insertion_Sort I_sort_AL = new Insertion_Sort();
    Insertion_Sort I_sort_LL = new Insertion_Sort();

    //Bubble sort with ArrayList and LinkedList
    Bubble_Sort B_sort_AL = new Bubble_Sort();
    Bubble_Sort B_sort_LL = new Bubble_Sort();

    //Merge sort with ArrayList and LinkedList
    Merge_Sort M_sort_AL = new Merge_Sort();
    Merge_Sort M_sort_LL = new Merge_Sort();

    //Tmp Variables
    ArrayList<Data> AL_BookID_IS = new ArrayList<>();
    LinkedList<Data> LL_BookID_IS = new LinkedList<>();

    ArrayList<Data> AL_BookID_BS = new ArrayList<>();
    LinkedList<Data> LL_BookID_BS = new LinkedList<>();

    ArrayList<Data> AL_BookID_MS = new ArrayList<>();
    LinkedList<Data> LL_BookID_MS = new LinkedList<>();

    ArrayList<Integer> I_counter_values_AL = new ArrayList<>();
    ArrayList<Integer> I_Y_values_AL = new ArrayList<>();
    LinkedList<Integer> I_counter_values_LL = new LinkedList<>();
    LinkedList<Integer> I_Y_values_LL = new LinkedList<>();

    ArrayList<Integer> B_counter_values_AL = new ArrayList<>();
    ArrayList<Integer> B_Y_values_AL = new ArrayList<>();
    LinkedList<Integer> B_counter_values_LL = new LinkedList<>();
    LinkedList<Integer> B_Y_values_LL = new LinkedList<>();

    ArrayList<Integer> M_counter_values_AL = new ArrayList<>();
    ArrayList<Integer> M_Y_values_AL = new ArrayList<>();
    LinkedList<Integer> M_counter_values_LL = new LinkedList<>();
    LinkedList<Integer> M_Y_values_LL = new LinkedList<>();

    ArrayList<Data> Gph_IS_AL = new ArrayList<>();
    ArrayList<Data> Gph_BS_AL = new ArrayList<>();
    ArrayList<Data> Gph_MS_AL = new ArrayList<>();
    LinkedList<Data> Gph_IS_LL = new LinkedList<>();
    LinkedList<Data> Gph_BS_LL = new LinkedList<>();
    LinkedList<Data> Gph_MS_LL = new LinkedList<>();

    ArrayList<Integer> X_Values_I_AL = new ArrayList<>();
    ArrayList<Integer> Y_Values_I_AL = new ArrayList<>();
    ArrayList<Integer> I_AL_Gph_counter = new ArrayList<>();
    LinkedList<Integer> X_Values_I_LL = new LinkedList<>();
    LinkedList<Integer> Y_Values_I_LL = new LinkedList<>();
    LinkedList<Integer> I_LL_Gph_counter = new LinkedList<>();

    ArrayList<Integer> X_Values_B_AL = new ArrayList<>();
    ArrayList<Integer> Y_Values_B_AL = new ArrayList<>();
    ArrayList<Integer> B_AL_Gph_counter = new ArrayList<>();
    LinkedList<Integer> X_Values_B_LL = new LinkedList<>();
    LinkedList<Integer> Y_Values_B_LL = new LinkedList<>();
    LinkedList<Integer> B_LL_Gph_counter = new LinkedList<>();

    ArrayList<Integer> X_Values_M_AL = new ArrayList<>();
    ArrayList<Integer> Y_Values_M_AL = new ArrayList<>();
    ArrayList<Integer> M_AL_Gph_counter = new ArrayList<>();
    LinkedList<Integer> X_Values_M_LL = new LinkedList<>();
    LinkedList<Integer> Y_Values_M_LL = new LinkedList<>();
    LinkedList<Integer> M_LL_Gph_counter = new LinkedList<>();

    int sum_I_AL = 0;
    int sum_M_AL = 0;
    int sum_B_AL = 0;
    int sum_I_LL = 0;
    int sum_M_LL = 0;
    int sum_B_LL = 0;

    int tmp1 = -1;
    int tmp2 = -1;
    int tmp3 = -1;
    int Tmp1 = -1;
    int Tmp2 = -1;
    int Tmp3 = -1;

    int run = 30;

    /**
     */
    public Main() {
        initComponents();
    }

    JTable table = new JTable();
    DefaultTableModel model = new DefaultTableModel();
    JScrollPane scroll;
    String headers[] = {"bookID", "title", "authors", "average_rating", "isbn", "isbn13", "language_code",
        "num_pages", "ratings_count", "text_reviews_count", "publication_date", "publisher"};
    String[] data = {""};

    JTable table1 = new JTable();
    DefaultTableModel model1 = new DefaultTableModel();
    JScrollPane scroll1;
    String headers1[] = {"Number Of runns", "Counter Values"};
    String[] data1 = {""};

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel119 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel120 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1535, 820));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jPanel1.setName(""); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Press the \"START\" button to read data into ArrayList and LinkedList ");

        jButton2.setBackground(new java.awt.Color(255, 204, 255));
        jButton2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 255));
        jButton2.setText("START");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\images (3).jpg")); // NOI18N
        jLabel7.setText(" ");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 5, true));

        jLabel8.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)))
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("In this program we will be reading and storing data into  linkedlist and arraylist separately");

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("And then sorting the data using various sorting algorithm");
        jLabel6.setAutoscrolls(true);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel13.setText("Bubble sort");

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        jButton9.setBackground(new java.awt.Color(204, 255, 255));
        jButton9.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton9.setText("Start sorting with ArrayList");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel22.setText("Operations Taken while sorting   ");

        jLabel23.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel23.setText("Arraylist with bubble sort algorithm");

        jLabel24.setBackground(new java.awt.Color(204, 255, 204));
        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 255));
        jLabel24.setText(" ");
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jButton10.setBackground(new java.awt.Color(204, 255, 255));
        jButton10.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton10.setText("Start sorting with LinkedList");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel25.setText("Operations Taken while sorting  ");

        jLabel26.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel26.setText("Linkedlist with bubble sort algorithm");

        jLabel61.setBackground(new java.awt.Color(204, 255, 204));
        jLabel61.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(51, 51, 255));
        jLabel61.setText(" ");
        jLabel61.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jButton10)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel50.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        jLabel50.setText("Time taken with ArrayList");

        jLabel51.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        jLabel51.setText("Time taken with LinkedList");

        jLabel52.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel52.setText(" ");
        jLabel52.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel53.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel53.setText(" ");
        jLabel53.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addGap(20, 20, 20))
        );

        jButton16.setBackground(new java.awt.Color(204, 204, 255));
        jButton16.setText("Clear All >>>");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(204, 204, 255));
        jButton25.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton25.setText("View Graph");
        jButton25.setBorder(null);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(7, 7, 7))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel14.setText("Merge sort");

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        jButton13.setBackground(new java.awt.Color(204, 255, 255));
        jButton13.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton13.setText("Start sorting with ArrayList");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel27.setText("Operations Taken while sorting   ");

        jLabel28.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel28.setText("Arraylist with merge sort algorithm");

        jLabel29.setBackground(new java.awt.Color(204, 255, 204));
        jLabel29.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 255));
        jLabel29.setText(" ");
        jLabel29.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jButton13))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel28)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addGap(4, 4, 4)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));

        jButton14.setBackground(new java.awt.Color(204, 255, 255));
        jButton14.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton14.setText("Start sorting with LinkedList");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel31.setText("Operations Taken while sorting  ");

        jLabel32.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel32.setText("Linkedlist with merge sort algorithm");

        jLabel33.setBackground(new java.awt.Color(204, 255, 204));
        jLabel33.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 255));
        jLabel33.setText(" ");
        jLabel33.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jButton14)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(13, 13, 13)
                .addComponent(jLabel33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel34.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        jLabel34.setText("Time taken with ArrayList");

        jLabel35.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        jLabel35.setText("Time taken with LinkedList");

        jLabel36.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel36.setText(" ");
        jLabel36.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel37.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel37.setText(" ");
        jLabel37.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addGap(20, 20, 20))
        );

        jButton15.setBackground(new java.awt.Color(204, 204, 255));
        jButton15.setText("Clear All >>>");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(204, 204, 255));
        jButton26.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton26.setText("View Graph");
        jButton26.setBorder(null);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));

        jButton17.setBackground(new java.awt.Color(204, 255, 255));
        jButton17.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton17.setText("Start sorting with ArrayList");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel38.setText(" ");
        jLabel38.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 255), null));

        jLabel40.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel40.setText("Time taken with ArrayList");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton17))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addGap(48, 48, 48))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton17)
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel64.setBackground(new java.awt.Color(255, 255, 255));
        jLabel64.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel64.setText("Built_in SOrt");

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));

        jLabel39.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel39.setText("Built_in sort    :");

        jLabel41.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel41.setText("Merge sort      :");

        jLabel42.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel42.setText("Bubble sort     :");

        jLabel43.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel43.setText("Insertion sort :");

        jLabel44.setBackground(new java.awt.Color(204, 204, 204));
        jLabel44.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel44.setText(" ");
        jLabel44.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel45.setBackground(new java.awt.Color(204, 204, 204));
        jLabel45.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel45.setText(" ");
        jLabel45.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel46.setBackground(new java.awt.Color(204, 204, 204));
        jLabel46.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel46.setText(" ");
        jLabel46.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel47.setBackground(new java.awt.Color(204, 204, 204));
        jLabel47.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel47.setText(" ");
        jLabel47.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel48.setBackground(new java.awt.Color(204, 204, 204));
        jLabel48.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel48.setText(" ");
        jLabel48.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel49.setBackground(new java.awt.Color(204, 204, 204));
        jLabel49.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel49.setText(" ");
        jLabel49.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel54.setBackground(new java.awt.Color(204, 204, 204));
        jLabel54.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel54.setText(" ");
        jLabel54.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel55.setBackground(new java.awt.Color(204, 204, 204));
        jLabel55.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel55.setText(" ");
        jLabel55.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel56.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel56.setText("Algorithm");

        jLabel57.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel57.setText("ArrayList");

        jLabel58.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel58.setText("LinkedList");

        jLabel59.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel59.setText("Operations Taken");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel58)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addGap(142, 142, 142))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel65.setBackground(new java.awt.Color(255, 255, 255));
        jLabel65.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel65.setText("Result");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel16.setText("Operations Taken while sorting   ");

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel17.setText("Arraylist with insertion sort algorithm");

        jLabel18.setBackground(new java.awt.Color(204, 255, 204));
        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 255));
        jLabel18.setText(" ");
        jLabel18.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton3.setText("Start sorting with ArrayList");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel17))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(4, 4, 4)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel9.setText("Insertion sort");

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setText("Time taken with ArrayList");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel11.setText("Time taken with LinkedList");

        jLabel12.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel12.setText(" ");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel15.setText(" ");
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(1, 1, 1)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton4.setText("Start sorting with LinkedList");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel19.setText("Operations Taken while sorting  ");

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel20.setText("Linkedlist with insertion sort algorithm");

        jLabel21.setBackground(new java.awt.Color(204, 255, 204));
        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 255));
        jLabel21.setText(" ");
        jLabel21.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), null));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jButton4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setText("Clear All >>>");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(204, 204, 255));
        jButton27.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton27.setText("View Graph");
        jButton27.setBorder(null);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 206, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(16, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Q1.", jPanel1);

        jPanel18.setBackground(new java.awt.Color(102, 102, 102));

        jLabel118.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel118.setText("Race all the algorithms together to find the winner. Graphical solution is expected here. Vertical axis should be the number of operation taken and ");

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        jButton6.setText("Start Race >>>");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel119.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel119.setText("the horizontal axis can be number of  Elements sorted. Click the \"START RACE\" button on the right to begin the race.");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton6)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(570, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Q2. Race", jPanel18);

        jPanel17.setBackground(new java.awt.Color(102, 102, 102));

        jPanel21.setBackground(new java.awt.Color(153, 153, 153));

        jLabel99.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel99.setText("Bubble Sort with LinkedList");

        jLabel100.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel100.setText("After running the algorithm 30 times, we have obtined the following results:");

        jButton22.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton22.setText("View Results");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jLabel101.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel101.setText("After getting the results, we have analysed the best, mean and worst solutions:");

        jLabel102.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel102.setText("Best    :");

        jLabel103.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(51, 0, 51));
        jLabel103.setText(" ");
        jLabel103.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel104.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel104.setText("Mean :");

        jLabel105.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(51, 0, 51));
        jLabel105.setText(" ");
        jLabel105.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel106.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel106.setText("Worst:");

        jLabel107.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(51, 0, 51));
        jLabel107.setText(" ");
        jLabel107.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel21Layout.createSequentialGroup()
                                            .addGap(16, 16, 16)
                                            .addComponent(jButton22))))
                                .addContainerGap(24, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel104)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel105)
                                .addComponent(jLabel103)
                                .addComponent(jLabel107))
                            .addComponent(jLabel102))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(153, 153, 153));

        jLabel72.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel72.setText("Bubble Sort with ArrayList");

        jLabel73.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel73.setText("After running the algorithm 30 times, we have obtined the following results:");

        jButton19.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton19.setText("View Results");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel74.setText("After getting the results, we have analysed the best, mean and worst solutions:");

        jLabel75.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel75.setText("Best    :");

        jLabel76.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(51, 0, 51));
        jLabel76.setText(" ");
        jLabel76.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel77.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel77.setText("Mean :");

        jLabel78.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(51, 0, 51));
        jLabel78.setText(" ");
        jLabel78.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel79.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel79.setText("Worst:");

        jLabel80.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(51, 0, 51));
        jLabel80.setText(" ");
        jLabel80.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel22Layout.createSequentialGroup()
                                            .addGap(16, 16, 16)
                                            .addComponent(jButton19))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel78)
                                .addComponent(jLabel76)
                                .addComponent(jLabel80))
                            .addComponent(jLabel75))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(153, 153, 153));

        jLabel60.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel60.setText("Worst:");

        jLabel62.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel62.setText("Best    :");

        jLabel63.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel63.setText("Mean :");

        jLabel66.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(51, 0, 51));
        jLabel66.setText(" ");
        jLabel66.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel68.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(51, 0, 51));
        jLabel68.setText(" ");
        jLabel68.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel69.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(51, 0, 51));
        jLabel69.setText(" ");
        jLabel69.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel67.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel67.setText("Insertion Sort with ArrayList");

        jLabel70.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel70.setText("After getting the results, we have analysed the best, mean and worst solutions:");

        jLabel71.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel71.setText("After running the algorithm 30 times, we have obtined the following results:");

        jButton18.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton18.setText("View Results");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel23Layout.createSequentialGroup()
                                            .addGap(16, 16, 16)
                                            .addComponent(jButton18)))
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(24, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel63)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel68)
                                .addComponent(jLabel66)))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(jLabel69))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel24.setBackground(new java.awt.Color(153, 153, 153));

        jLabel90.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel90.setText("Insertion Sort with LinkedList");

        jLabel91.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel91.setText("After running the algorithm 30 times, we have obtined the following results:");

        jButton21.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton21.setText("View Results");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel92.setText("After getting the results, we have analysed the best, mean and worst solutions:");

        jLabel93.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel93.setText("Best    :");

        jLabel94.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(51, 0, 51));
        jLabel94.setText(" ");
        jLabel94.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel95.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel95.setText("Mean :");

        jLabel96.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(51, 0, 51));
        jLabel96.setText(" ");
        jLabel96.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel97.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel97.setText("Worst:");

        jLabel98.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(51, 0, 51));
        jLabel98.setText(" ");
        jLabel98.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel90)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                            .addGap(16, 16, 16)
                                            .addComponent(jButton21))))
                                .addContainerGap(24, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel95)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel96)
                                .addComponent(jLabel94)
                                .addComponent(jLabel98))
                            .addComponent(jLabel93))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel26.setBackground(new java.awt.Color(153, 153, 153));

        jLabel108.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel108.setText("Merge Sort with LinkedList");

        jLabel109.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel109.setText("After running the algorithm 30 times, we have obtined the following results:");

        jButton23.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton23.setText("View Results");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jLabel110.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel110.setText("After getting the results, we have analysed the best, mean and worst solutions:");

        jLabel111.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel111.setText("Best    :");

        jLabel112.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(51, 0, 51));
        jLabel112.setText(" ");
        jLabel112.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel113.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel113.setText("Mean :");

        jLabel114.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(51, 0, 51));
        jLabel114.setText(" ");
        jLabel114.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel115.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel115.setText("Worst:");

        jLabel116.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(51, 0, 51));
        jLabel116.setText(" ");
        jLabel116.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel108)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel26Layout.createSequentialGroup()
                                            .addGap(16, 16, 16)
                                            .addComponent(jButton23))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel113)
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel114)
                                .addComponent(jLabel112)
                                .addComponent(jLabel116))
                            .addComponent(jLabel111))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel27.setBackground(new java.awt.Color(153, 153, 153));

        jLabel81.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel81.setText("Merge Sort with ArrayList");

        jLabel82.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel82.setText("After running the algorithm 30 times, we have obtined the following results:");

        jButton20.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton20.setText("View Results");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel83.setText("After getting the results, we have analysed the best, mean and worst solutions:");

        jLabel84.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel84.setText("Best    :");

        jLabel85.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(51, 0, 51));
        jLabel85.setText(" ");
        jLabel85.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel86.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel86.setText("Mean :");

        jLabel87.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(51, 0, 51));
        jLabel87.setText(" ");
        jLabel87.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel88.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel88.setText("Worst:");

        jLabel89.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(51, 0, 51));
        jLabel89.setText(" ");
        jLabel89.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel27Layout.createSequentialGroup()
                                            .addGap(16, 16, 16)
                                            .addComponent(jButton20))))
                                .addContainerGap(24, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel86)
                            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel87)
                                .addComponent(jLabel85)
                                .addComponent(jLabel89))
                            .addComponent(jLabel84))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jButton12.setBackground(new java.awt.Color(204, 204, 255));
        jButton12.setFont(new java.awt.Font("Calibri", 3, 48)); // NOI18N
        jButton12.setText("Start test >>>");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel30.setText("We will run the same problem at least 31 times (instances) in our empirical testing. Compare the efficiency of the two algorithms statistically, ");

        jLabel117.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel117.setText("i.e., find  success rate (SR) along with best, mean and max ");

        jButton5.setText("jButton5");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(458, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(282, 282, 282))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(jButton5)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Q3. Empircal Testing", jPanel17);

        jPanel28.setBackground(new java.awt.Color(102, 102, 102));

        jButton8.setBackground(new java.awt.Color(204, 204, 255));
        jButton8.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        jButton8.setText("View Graph >>>");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel120.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel120.setText("Worst case time complexity of all the algorithm graphically with different data structures");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel120)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(631, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Q4. Worst case time complexity", jPanel28);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Clearing all the counter values
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        I_sort_AL.counter_I = -1;
        I_Y_values_AL.clear();
        I_counter_values_LL.clear();
        I_sort_LL.counter_I = -1;
        I_Y_values_LL.clear();
        I_counter_values_LL.clear();

        AL_BookID_IS.clear();
        LL_BookID_IS.clear();

        jLabel18.setText(" ");
        jLabel12.setText(" ");
        jLabel47.setText(" ");
        jLabel21.setText(" ");
        jLabel15.setText(" ");
        jLabel48.setText(" ");
    }//GEN-LAST:event_jButton7ActionPerformed

    //Insertion sort with LinkedList
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Cal_L(LL_BookID_IS);

        //Random function
        Collections.shuffle(LL_BookID_IS);

        //calling a function
        long start = System.currentTimeMillis();
        I_sort_LL.InsertionSort(LL_BookID_IS);
        long end = System.currentTimeMillis();
        //finding the time difference and converting it into seconds
        float sec = (end - start) / 1000F;

        //Storing counter values
        I_counter_values_LL.add(I_sort_LL.counter_I);

        //analying counter values (Insertion Sort)
        I_Y_values_LL.add(0, I_counter_values_LL.get(0));

        //checks if the list is empty
        if (I_Y_values_LL.isEmpty()) {
            jLabel18.setText("List is empty!");
            //Printing the values
        } else {
            jLabel21.setText("" + I_Y_values_LL.get(0));
            jLabel15.setText("" + sec + " s");
            jLabel48.setText("" + I_Y_values_LL.get(0));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    //Insertion sort with ArrayList
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Cal_A(AL_BookID_IS);

        //Random function
        Collections.shuffle(AL_BookID_IS);

        //calling a function
        long start = System.currentTimeMillis();
        I_sort_AL.InsertionSort(AL_BookID_IS);
        long end = System.currentTimeMillis();
        //finding the time difference and converting it into seconds
        float sec = (end - start) / 1000F;

        //Storing counter values
        I_counter_values_AL.add(I_sort_AL.counter_I);

        //analying counter values (Insertion Sort)
        I_Y_values_AL.add(0, I_counter_values_AL.get(0));

        //checks if the list is empty
        if (I_Y_values_AL.isEmpty()) {
            jLabel18.setText("List is empty!");
            //Printing the values
        } else {
            jLabel18.setText("" + I_Y_values_AL.get(0));
            jLabel12.setText("" + sec + " s");
            jLabel47.setText("" + I_Y_values_AL.get(0));

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        Collections.shuffle(A_bookID);

        //calling a function
        long start = System.currentTimeMillis();
        Collections.sort(A_bookID);
        long end = System.currentTimeMillis();
        //finding the time difference and converting it into seconds
        float sec = (end - start) / 1000F;

        jLabel38.setText("" + sec + " s");
        jLabel44.setText("" + sec + " s");
    }//GEN-LAST:event_jButton17ActionPerformed

    //Clearing values for Merge sort
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        M_sort_AL.counter_M = -1;
        M_Y_values_AL.clear();
        M_counter_values_AL.clear();
        M_sort_LL.counter_M = -1;
        M_Y_values_LL.clear();
        M_counter_values_LL.clear();

        jLabel29.setText(" ");
        jLabel36.setText(" ");
        jLabel45.setText(" ");
        jLabel33.setText(" ");
        jLabel37.setText(" ");
        jLabel54.setText(" ");
    }//GEN-LAST:event_jButton15ActionPerformed

    //Merge sort with LinkedList
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        Cal_L(LL_BookID_MS);

        Collections.shuffle(LL_BookID_MS);

        //calling a function
        long start = System.currentTimeMillis();
        M_sort_LL.mergeSort_LL(LL_BookID_MS);
        long end = System.currentTimeMillis();
        //finding the time difference and converting it into seconds
        float sec = (end - start) / 1000F;

        //Storing counter values
        M_counter_values_LL.add(M_sort_LL.counter_M);

        //analying counter values (Insertion Sort)
        M_Y_values_LL.add(0, M_counter_values_LL.get(0));

        //checks if the list is empty
        if (M_Y_values_LL.isEmpty()) {
            jLabel29.setText("List is empty!");
        } else {
            jLabel33.setText("" + M_Y_values_LL.get(0));
            jLabel37.setText("" + sec + " s");
            jLabel54.setText("" + M_Y_values_LL.get(0));
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    //Merge sort with Arrayist
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        Cal_A(AL_BookID_MS);

        Collections.shuffle(AL_BookID_MS);

        //calling a function
        long start = System.currentTimeMillis();
        M_sort_AL.mergeSort_AL(AL_BookID_MS);
        long end = System.currentTimeMillis();
        //finding the time difference and converting it into seconds
        float sec = (end - start) / 1000F;

        //Storing counter values
        M_counter_values_AL.add(M_sort_AL.counter_M);

        //analying counter values (Insertion Sort)
        M_Y_values_AL.add(0, M_counter_values_AL.get(0));

        //checks if the list is empty
        if (M_Y_values_AL.isEmpty()) {
            jLabel29.setText("List is empty!");
        } else {
            jLabel29.setText("" + M_Y_values_AL.get(0));
            jLabel36.setText("" + sec + " s");
            jLabel45.setText("" + M_Y_values_AL.get(0));
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        B_sort_AL.counter_B = -1;
        B_Y_values_AL.clear();
        B_counter_values_AL.clear();
        B_sort_LL.counter_B = -1;
        B_Y_values_LL.clear();
        B_counter_values_LL.clear();

        jLabel52.setText(" ");
        jLabel24.setText(" ");
        jLabel46.setText(" ");
        jLabel61.setText(" ");
        jLabel53.setText(" ");
        jLabel49.setText(" ");
    }//GEN-LAST:event_jButton16ActionPerformed

    //Bubble sort with LinkedList
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        Cal_L(LL_BookID_BS);

        Collections.shuffle(LL_BookID_BS);

        //calling a function
        long start = System.currentTimeMillis();
        B_sort_LL.bubbleSort(LL_BookID_BS);
        long end = System.currentTimeMillis();
        //finding the time difference and converting it into seconds
        float sec = (end - start) / 1000F;

        //Storing counter values
        B_counter_values_LL.add(B_sort_LL.counter_B);

        //analying counter values (Insertion Sort)
        B_Y_values_LL.add(0, B_counter_values_LL.get(0));

        //checks if the list is empty
        if (B_Y_values_LL.isEmpty()) {
            jLabel24.setText("List is empty!");
        } else {
            jLabel61.setText("" + B_Y_values_LL.get(0));
            jLabel53.setText("" + sec + " s");
            jLabel49.setText("" + B_Y_values_LL.get(0));
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    //Bubble sort with ArrayList
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Cal_A(AL_BookID_BS);

        Collections.shuffle(AL_BookID_BS);

        //calling a function
        long start = System.currentTimeMillis();
        B_sort_AL.bubbleSort(AL_BookID_BS);
        long end = System.currentTimeMillis();
        //finding the time difference and converting it into seconds
        float sec = (end - start) / 1000F;

        //Storing counter values
        B_counter_values_AL.add(B_sort_AL.counter_B);

        //analying counter values (Insertion Sort)
        B_Y_values_AL.add(0, B_counter_values_AL.get(0));

        //checks if the list is empty
        if (B_Y_values_AL.isEmpty()) {
            jLabel24.setText("List is empty!");
        } else {
            jLabel24.setText("" + B_Y_values_AL.get(0));
            jLabel52.setText("" + sec + " s");
            jLabel46.setText("" + B_Y_values_AL.get(0));
        }
    }//GEN-LAST:event_jButton9ActionPerformed

//Storing data in ArrayList and LinkedList
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {

            // TODO add your handling code here:
            String columnHeading = "";
            int noOfRows = 0;
            int noOFcolumns = 0;
            String filename = "books.csv"; //Edit your filename here, to a .csv file of your choice
            File x = new File(filename);
            Scanner sc = new Scanner(x);
            System.out.println("Please wait while reading File: " + filename);
            columnHeading = sc.nextLine();
            String[] temp = columnHeading.split(",");
            noOFcolumns = temp.length;
            while (sc.hasNext()) {
                String str = sc.nextLine();
                String[] tokens = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);   //Shoutout and credits to a certain user at the Stackoverflow site, whom whose username I can't recall.
                String tmp = "";                                                        //If you somehow come across Line33 in Stackoverflow, please tell me the username so I can add here

                for (int m = 0; m < tokens.length; m++) {
                    tmp = tmp + " || " + tokens[m];
                }

                Data aLine = new Data(tokens[0]);
                Data aLine1 = new Data(tokens[1]);
                Data aLine2 = new Data(tokens[2]);
                Data aLine3 = new Data(tokens[3]);
                Data aLine4 = new Data(tokens[4]);
                Data aLine5 = new Data(tokens[5]);
                Data aLine6 = new Data(tokens[6]);
                Data aLine7 = new Data(tokens[7]);
                Data aLine8 = new Data(tokens[8]);
                Data aLine9 = new Data(tokens[9]);
                Data aLine12 = new Data(tokens[10]);

                Data aLine10 = new Data(tokens[tokens.length - 1]);
                Data aline11 = new Data(tmp);

                //Storing data in ArrayList
                Book_ArrayList.add(aline11);
                A_title.add(aLine1);
                A_authors.add(aLine2);
                A_average_rating.add(aLine3);
                A_isbn.add(aLine4);
                A_isbn13.add(aLine5);
                A_language_code.add(aLine6);
                A_num_pages.add(aLine7);
                A_ratings_count.add(aLine8);
                A_text_reviews_count.add(aLine9);
                A_publication_date.add(aLine12);
                A_publisher.add(aLine10);

                //Storing data in ArrayList
                Book_LinkedList.add(aline11);
                L_title.add(aLine1);
                L_authors.add(aLine2);
                L_average_rating.add(aLine3);
                L_isbn.add(aLine4);
                L_isbn13.add(aLine5);
                L_language_code.add(aLine6);
                L_num_pages.add(aLine7);
                L_ratings_count.add(aLine8);
                L_text_reviews_count.add(aLine9);
                L_publication_date.add(aLine12);
                L_publisher.add(aLine10);

                String t = tokens[0];
                int qwe = Integer.parseInt(t);

                Data y = new Data();
                y.set(qwe);

                A_bookID.add(y);
                L_bookID.add(y);

                ++noOfRows;
            }

            jLabel8.setText("File reading complete");
            System.out.println("\nFile reading COMPLETE.\n");
            sc.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    //empirical Testing 
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:  

        //Running Insertion sort with arraylist (30 times) 
        test_IS(AL_BookID_IS, I_counter_values_AL, I_sort_AL);
        analyse(I_Y_values_AL, I_counter_values_AL);
        int sum_IS_AL = avg(I_Y_values_AL, sum_I_AL);

        //Running Insertion sort with linkedlist (30 times) 
        test_IS(LL_BookID_IS, I_counter_values_LL, I_sort_LL);
        analyse(I_Y_values_LL, I_counter_values_LL);
        int sum_IS_LL = avg(I_Y_values_LL, sum_I_LL);

        //Running Bubble sort with arraylist (30 times) 
        test_BS(AL_BookID_BS, B_counter_values_AL, B_sort_AL);
        analyse(B_Y_values_AL, B_counter_values_AL);
        int sum_BS_AL = avg(B_Y_values_AL, sum_B_AL);

        //Running Bubble sort with linkedlist (30 times) 
        test_BS(AL_BookID_BS, B_counter_values_LL, B_sort_LL);
        analyse(B_Y_values_LL, B_counter_values_LL);
        int sum_BS_LL = avg(B_Y_values_LL, sum_B_LL);

        //Running Merge sort with Arraylist (30 times) 
        test_MS(AL_BookID_MS, M_counter_values_AL, M_sort_AL);
        analyse(M_Y_values_AL, M_counter_values_AL);
        int sum_MS_AL = avg(M_Y_values_AL, sum_M_AL);

        //Running Merge sort with linkedlist (30 times) 
        test_M(LL_BookID_MS, M_counter_values_LL, M_sort_LL);
        analyse(M_Y_values_LL, M_counter_values_LL);
        int sum_MS_LL = avg(M_Y_values_LL, sum_M_LL);

        //printing results for insertion sort with ArrayList
        jLabel69.setText("" + I_Y_values_AL.get(0));                            //Best  
        jLabel68.setText("" + sum_IS_AL / (int) I_Y_values_AL.size());          //Mean
        jLabel66.setText("" + (I_Y_values_AL.get(I_Y_values_AL.size() - 1)));   //Worst

        //printing results for insertion sort with LinkedList
        jLabel94.setText("" + I_Y_values_LL.get(0));                            //Best  
        jLabel96.setText("" + sum_IS_LL / (int) I_Y_values_LL.size());          //Mean
        jLabel98.setText("" + (I_Y_values_LL.get(I_Y_values_LL.size() - 1)));   //Worst

        //printing results for bubble sort with ArrayList
        jLabel76.setText("" + B_Y_values_AL.get(0));                            //Best
        jLabel78.setText("" + sum_BS_AL / (int) B_Y_values_AL.size());           //Mean
        jLabel80.setText("" + (B_Y_values_AL.get(B_Y_values_AL.size() - 1)));   //Worst    

        //printing results for bubble sort with LinkedList
        jLabel103.setText("" + B_Y_values_LL.get(0));                           //Best
        jLabel105.setText("" + sum_BS_LL / (int) B_Y_values_LL.size());         //Mean
        jLabel107.setText("" + (B_Y_values_LL.get(B_Y_values_LL.size() - 1)));  //Worst

        //printing results for Merge sort with ArrayList
        jLabel85.setText("" + M_Y_values_AL.get(0));                            //Best
        jLabel87.setText("" + sum_MS_AL / (int) M_Y_values_AL.size());           //Mean
        jLabel89.setText("" + (M_Y_values_AL.get(M_Y_values_AL.size() - 1)));   //Worst 

        //printing results for Merge sort with LinkedList
        jLabel112.setText("" + M_Y_values_LL.get(0));                            //Best
        jLabel114.setText("" + sum_MS_LL / (int) M_Y_values_LL.size());           //Mean
        jLabel116.setText("" + (M_Y_values_LL.get(M_Y_values_LL.size() - 1)));   //Worst 

    }//GEN-LAST:event_jButton12ActionPerformed

    //Display Results for Insertion Sort (empirical testing) => Running the Algorithm 30 times 
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        Main newJFrame = new Main(I_Y_values_AL);                     //(I_Y_values_AL) => indicates the Counter Values

    }//GEN-LAST:event_jButton18ActionPerformed

    //Display Results for Insertion Sort (empirical testing) => Running the Algorithm 30 times 
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        Main newJFrame = new Main(B_Y_values_AL);                     //(B_Y_values_AL) => indicates the Counter Values

    }//GEN-LAST:event_jButton19ActionPerformed

    //Display Results for Insertion Sort(ArrayList) (empirical testing) => Running the Algorithm 30 times 
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        Main newJFrame = new Main(M_Y_values_AL);                     //(M_Y_values_AL) => indicates the Counter Values
    }//GEN-LAST:event_jButton20ActionPerformed

    //Display Results for Insertion Sort(LinkedList) (empirical testing) => Running the Algorithm 30 times 
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        Main newJFrame = new Main(I_Y_values_LL);                     //(I_Y_values_LL) => indicates the Counter Values
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        Main newJFrame = new Main(B_Y_values_LL);                     //(I_Y_values_LL) => indicates the Counter Values
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        Main newJFrame = new Main(M_Y_values_LL);                     //(I_Y_values_LL) => indicates the Counter Values
    }//GEN-LAST:event_jButton23ActionPerformed

    //Graph of Bubble sort for ArrayList and LinkedList
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        //Bubble sort LinkedList
        Gph_BS_LL.clear();
        B_LL_Gph_counter.clear();
        Y_Values_B_LL.clear();
        X_Values_B_LL.clear();
        int Tmp = -1;
        B_sort_LL.counter_B = -1;
        int size_LL = -1;

        //Bubble Sort with ArrayList
        Gph_BS_AL.clear();
        B_AL_Gph_counter.clear();
        Y_Values_B_AL.clear();
        X_Values_B_AL.clear();
        int tmp = -1;
        B_sort_AL.counter_B = -1;
        int size_AL = -1;

        size_AL = LL_BookID_BS.size() / 20;
        size_LL = AL_BookID_BS.size() / 20;

        //Getting  
        for (double i = 0.05; i <= 1; i = i + 0.05) {
            BS_Graph_LL(i);
        }
        Gph_BS_LL.clear();
        BS_Graph_LL(1);

        for (double i = 0.05; i <= 1; i = i + 0.05) {
            BS_Graph_AL(i);
        }
        Gph_BS_AL.clear();
        BS_Graph_AL(1);

        //Storing counter values
        //analying counter values (Insertion Sort)
        Y_Values_B_LL.add(0, B_LL_Gph_counter.get(0));
        for (int i = 1; i <= B_LL_Gph_counter.size() - 1; i++) {
            Tmp = B_LL_Gph_counter.get(i - 1) - B_LL_Gph_counter.get(i);
            Y_Values_B_LL.add(i, (-(Tmp)));
        }
        //Storing counter values
        //analying counter values (Insertion Sort)
        Y_Values_B_AL.add(0, B_AL_Gph_counter.get(0));
        for (int i = 1; i <= B_AL_Gph_counter.size() - 1; i++) {
            tmp = B_AL_Gph_counter.get(i - 1) - B_AL_Gph_counter.get(i);
            Y_Values_B_AL.add(i, (-(tmp)));
        }

        for (int i = 0; i <= (LL_BookID_BS.size()); i++) {
            if (i % size_AL == 0) {
                X_Values_B_LL.add(i);
            }
        }
        for (int i = 0; i <= (AL_BookID_BS.size()); i++) {
            if (i % size_AL == 0) {
                X_Values_B_AL.add(i);
            }
        }

        X_Values_B_LL.remove(0);
        X_Values_B_AL.remove(0);

        System.out.println(X_Values_B_LL);
        System.out.println(Y_Values_B_LL);

        try {
            //Matlab
            eng = MatlabEngine.startMatlab();

            int[] val_X1 = X_Values_B_LL.stream().mapToInt(i -> i).toArray();
            int[] val_Y1 = Y_Values_B_LL.stream().mapToInt(i -> i).toArray();
            int[] val_Y2 = Y_Values_B_AL.stream().mapToInt(i -> i).toArray();

            eng.eval("hold on");
            eng.putVariable("val_X1", val_X1);
            eng.putVariable("val_Y1", val_Y1);
            eng.putVariable("val_Y2", val_Y2);

            eng.eval("grid on");
            eng.eval("title('Bubble Sort Graph')");
            eng.eval("xlabel('Number of Elements')");
            eng.eval("ylabel('Comparison Count')");

            eng.eval("bar(val_X1,[val_Y1;val_Y2],0.7)");

            eng.eval("legend({'ArrayList','LinkedList'},'Location','west')");

        } catch (CancellationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    //Graph for Merge sort (ArrayList and Linkedlist)
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        //Merge sort LinkedList
        Gph_MS_LL.clear();
        M_LL_Gph_counter.clear();
        Y_Values_M_LL.clear();
        X_Values_M_LL.clear();
        int Tmp = -1;
        M_sort_LL.counter_M = -1;
        int size_LL = -1;

        //Merge Sort with ArrayList
        Gph_MS_AL.clear();
        M_AL_Gph_counter.clear();
        Y_Values_M_AL.clear();
        X_Values_M_AL.clear();
        int tmp = -1;
        M_sort_AL.counter_M = -1;
        int size_AL = -1;

        size_AL = LL_BookID_MS.size() / 20;
        size_LL = AL_BookID_MS.size() / 20;

        System.out.println(size_AL + " " + size_LL);

        //Getting  
        for (double i = 0.05; i <= 1; i = i + 0.05) {
            MS_Graph_LL(i);
        }
        Gph_MS_LL.clear();
        MS_Graph_LL(1);

        for (double i = 0.05; i <= 1; i = i + 0.05) {
            MS_Graph_AL(i);
        }
        Gph_MS_AL.clear();
        MS_Graph_AL(1);

        //Storing counter values
        //analying counter values (Insertion Sort)
        Y_Values_M_LL.add(0, M_LL_Gph_counter.get(0));
        for (int i = 1; i <= M_LL_Gph_counter.size() - 1; i++) {
            Tmp = M_LL_Gph_counter.get(i - 1) - M_LL_Gph_counter.get(i);
            Y_Values_M_LL.add(i, (-(Tmp)));
        }
        //Storing counter values
        //analying counter values (Insertion Sort)
        Y_Values_M_AL.add(0, M_AL_Gph_counter.get(0));
        for (int i = 1; i <= M_AL_Gph_counter.size() - 1; i++) {
            tmp = M_AL_Gph_counter.get(i - 1) - M_AL_Gph_counter.get(i);
            Y_Values_M_AL.add(i, (-(tmp)));
        }

        for (int i = 0; i <= (LL_BookID_MS.size()); i++) {
            if (i % size_AL == 0) {
                X_Values_M_LL.add(i);
            }
        }
        for (int i = 0; i <= (AL_BookID_MS.size()); i++) {
            if (i % size_AL == 0) {
                X_Values_M_AL.add(i);
            }
        }

        X_Values_M_LL.remove(0);
        X_Values_M_AL.remove(0);

        System.out.println(X_Values_M_LL);
        System.out.println(Y_Values_M_LL);
        try {
            //Matlab
            eng = MatlabEngine.startMatlab();

            int[] val_X1 = X_Values_M_LL.stream().mapToInt(i -> i).toArray();
            int[] val_Y1 = Y_Values_M_LL.stream().mapToInt(i -> i).toArray();
            int[] val_Y2 = Y_Values_M_AL.stream().mapToInt(i -> i).toArray();

            eng.eval("hold on");
            eng.putVariable("val_X1", val_X1);
            eng.putVariable("val_Y1", val_Y1);
            eng.putVariable("val_Y2", val_Y2);

            eng.eval("grid on");
            eng.eval("title('Merge Sort Graph')");
            eng.eval("xlabel('Number of Elements')");
            eng.eval("ylabel('Comparison Count')");

            eng.eval("bar(val_X1,[val_Y1;val_Y2],0.7)");

            eng.eval("legend({'ArrayList','LinkedList'},'Location','west')");

        } catch (CancellationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    //Gragh for Insertion Sort(ArrayList and LinkedList)
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:  
        //Insertion sort LinkedList
        Gph_IS_LL.clear();
        I_LL_Gph_counter.clear();
        Y_Values_I_LL.clear();
        X_Values_I_LL.clear();
        int Tmp = -1;
        I_sort_LL.counter_I = -1;
        int size_LL = -1;

        //Insertion Sort with ArrayList
        Gph_IS_AL.clear();
        I_AL_Gph_counter.clear();
        Y_Values_I_AL.clear();
        X_Values_I_AL.clear();
        int tmp = -1;
        I_sort_AL.counter_I = -1;
        int size_AL = -1;

        size_AL = LL_BookID_IS.size() / 20;
        size_LL = AL_BookID_IS.size() / 20;

        //Getting  
        for (double i = 0.05; i <= 1; i = i + 0.05) {
            IS_Graph_LL(i);
        }
        Gph_IS_LL.clear();
        IS_Graph_LL(1);

        for (double i = 0.05; i <= 1; i = i + 0.05) {
            IS_Graph_AL(i);
        }
        Gph_IS_AL.clear();
        IS_Graph_AL(1);

        //Storing counter values
        //analying counter values (Insertion Sort)
        Y_Values_I_LL.add(0, I_LL_Gph_counter.get(0));
        for (int i = 1; i <= I_LL_Gph_counter.size() - 1; i++) {
            Tmp = I_LL_Gph_counter.get(i - 1) - I_LL_Gph_counter.get(i);
            Y_Values_I_LL.add(i, (-(Tmp)));
        }
        //Storing counter values
        //analying counter values (Insertion Sort)
        Y_Values_I_AL.add(0, I_AL_Gph_counter.get(0));
        for (int i = 1; i <= I_AL_Gph_counter.size() - 1; i++) {
            tmp = I_AL_Gph_counter.get(i - 1) - I_AL_Gph_counter.get(i);
            Y_Values_I_AL.add(i, (-(tmp)));
        }

        for (int i = 0; i <= (LL_BookID_IS.size()); i++) {
            if (i % size_AL == 0) {
                X_Values_I_LL.add(i);
            }
        }
        for (int i = 0; i <= (AL_BookID_IS.size()); i++) {
            if (i % size_AL == 0) {
                X_Values_I_AL.add(i);
            }
        }

        X_Values_I_LL.remove(0);
        X_Values_I_AL.remove(0);

        System.out.println(X_Values_I_LL);
        System.out.println(Y_Values_I_LL);

        try {
            //Matlab
            eng = MatlabEngine.startMatlab();

            int[] val_X1 = X_Values_I_LL.stream().mapToInt(i -> i).toArray();
            int[] val_Y1 = Y_Values_I_LL.stream().mapToInt(i -> i).toArray();
            int[] val_Y2 = Y_Values_I_AL.stream().mapToInt(i -> i).toArray();

            eng.eval("hold on");
            eng.putVariable("val_X1", val_X1);
            eng.putVariable("val_Y1", val_Y1);
            eng.putVariable("val_Y2", val_Y2);

            eng.eval("grid on");
            eng.eval("title('Insertion Sort Graph')");
            eng.eval("xlabel('Number of Elements')");
            eng.eval("ylabel('Comparison Count')");

            eng.eval("bar(val_X1,[val_Y1;val_Y2],0.7)");

            eng.eval("legend({'ArrayList','LinkedList'},'Location','west')");

        } catch (CancellationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    //Race
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //Insertion Sort with ArrayList
        Gph_IS_AL.clear();
        I_AL_Gph_counter.clear();
        Y_Values_I_AL.clear();
        X_Values_I_AL.clear();
        I_sort_AL.counter_I = -1;
        int size_AL = -1;
        int IS_AL = - 1;

        //Insertion sort LinkedList
        Gph_IS_LL.clear();
        I_LL_Gph_counter.clear();
        Y_Values_I_LL.clear();
        X_Values_I_LL.clear();
        I_sort_LL.counter_I = -1;
        int size_LL = -1;
        int IS_LL = - 1;

        //Bubble sort LinkedList
        Gph_BS_LL.clear();
        B_LL_Gph_counter.clear();
        Y_Values_B_LL.clear();
        X_Values_B_LL.clear();
        int Tmp = -1;
        B_sort_LL.counter_B = -1;
        int BS_AL = - 1;

        //Bubble Sort with ArrayList
        Gph_BS_AL.clear();
        B_AL_Gph_counter.clear();
        Y_Values_B_AL.clear();
        X_Values_B_AL.clear();
        int tmp = -1;
        B_sort_AL.counter_B = -1;
        int BS_LL = - 1;

        //Merge sort LinkedList
        Gph_MS_LL.clear();
        M_LL_Gph_counter.clear();
        Y_Values_M_LL.clear();
        X_Values_M_LL.clear();
        int Tmp1 = -1;
        M_sort_LL.counter_M = -1;
        int MS_LL = -1;

        //Merge Sort with ArrayList
        Gph_MS_AL.clear();
        M_AL_Gph_counter.clear();
        Y_Values_M_AL.clear();
        X_Values_M_AL.clear();
        int tmp2 = -1;
        M_sort_AL.counter_M = -1;
        int MS_AL = -1;

        size_AL = AL_BookID_IS.size() / 10;
        size_LL = LL_BookID_IS.size() / 10;

        //Insertion sort with ArrayList  
        for (double i = 0.1; i <= 1; i = i + 0.1) {
            IS_AL = IS_Graph_AL(i);
        }

        //Insertion sort with LinkedList  
        for (double i = 0.1; i <= 1; i = i + 0.1) {
            IS_LL = IS_Graph_LL(i);
        }

        //Bubble sort with ArrayList  
        for (double i = 0.1; i <= 1; i = i + 0.1) {
            BS_AL = BS_Graph_AL(i);
        }

        //Bubble sort with LinkedList  
        for (double i = 0.1; i <= 1; i = i + 0.1) {
            BS_LL = BS_Graph_LL(i);
        }

        //Bubble sort with ArrayList  
        for (double i = 0.1; i <= 1; i = i + 0.1) {
            MS_AL = MS_Graph_AL(i);
        }

        //Bubble sort with LinkedList  
        for (double i = 0.1; i <= 1; i = i + 0.1) {
            MS_LL = MS_Graph_LL(i);
        }

        Runnable r1 = new greet(IS_AL);
        Runnable r2 = new greet(IS_LL);
        Runnable r3 = new greet(BS_AL);
        Runnable r4 = new greet(BS_LL);
        Runnable r5 = new greet(MS_AL);
        Runnable r6 = new greet(MS_LL);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);
        Thread t5 = new Thread(r5);
        Thread t6 = new Thread(r6);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        //analying counter values (Insertion Sort)  (ArrayList and LinkedList)    
        Analyse(Y_Values_I_AL, I_AL_Gph_counter);
        X_Values(size_AL, X_Values_I_AL, AL_BookID_IS);
        Analyse(Y_Values_I_LL, I_LL_Gph_counter);
        X_Values(size_AL, X_Values_I_LL, LL_BookID_IS);

        //analying counter values (Bubble Sort)  (ArrayList and LinkedList)    
        Analyse(Y_Values_B_AL, B_AL_Gph_counter);
        X_Values(size_AL, X_Values_B_AL, AL_BookID_BS);
        Analyse(Y_Values_B_LL, B_LL_Gph_counter);
        X_Values(size_AL, X_Values_B_LL, LL_BookID_BS);

        //analying counter values (Merge Sort)  (ArrayList and LinkedList)    
        Analyse(Y_Values_M_AL, M_AL_Gph_counter);
        X_Values(size_AL, X_Values_M_AL, AL_BookID_MS);
        Analyse(Y_Values_M_LL, M_LL_Gph_counter);
        X_Values(size_AL, X_Values_M_LL, LL_BookID_MS);
 

        try {
            //Matlab
            eng = MatlabEngine.startMatlab();

            int[] val_X = X_Values_I_AL.stream().mapToInt(i -> i).toArray();

            int[] val_Y1 = Y_Values_I_AL.stream().mapToInt(i -> i).toArray();
            int[] val_Y2 = Y_Values_I_LL.stream().mapToInt(i -> i).toArray();
            int[] val_Y3 = Y_Values_B_AL.stream().mapToInt(i -> i).toArray();
            int[] val_Y4 = Y_Values_B_LL.stream().mapToInt(i -> i).toArray();
            int[] val_Y5 = Y_Values_M_AL.stream().mapToInt(i -> i).toArray();
            int[] val_Y6 = Y_Values_M_LL.stream().mapToInt(i -> i).toArray();

            eng.eval("hold on");
            eng.putVariable("val_X", val_X);

            eng.putVariable("val_Y1", val_Y1);
            eng.putVariable("val_Y2", val_Y2);
            eng.putVariable("val_Y3", val_Y3);
            eng.putVariable("val_Y4", val_Y4);
            eng.putVariable("val_Y5", val_Y5);
            eng.putVariable("val_Y6", val_Y6);

            eng.eval("grid on");

            eng.eval("title('Insertion Sort VS Bubble Sort VS Merge Sort Graph')");
            eng.eval("xlabel('Number of Elements')");
            eng.eval("ylabel('Comparison Count')");

            eng.eval("bar(val_X,[val_Y5;val_Y6;val_Y1;val_Y2;val_Y3;val_Y4],0.9)");

            eng.eval("legend({'Merge sort with ArrayList','Merge sort with LinkedList',"
                    + "'Insertion sort with ArrayList','Insertion sort with LinkedList',"
                    + "'Bubble sort with ArrayList','Bubble sort with LinkedList'},'Location','northwest')");

        } catch (CancellationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            eng = MatlabEngine.startMatlab();

            int WC_IS_AL = I_Y_values_AL.get(I_Y_values_AL.size() - 1);
            int WC_IS_LL = I_Y_values_LL.get(I_Y_values_LL.size() - 1);
            int WC_BS_AL = B_Y_values_AL.get(B_Y_values_AL.size() - 1);
            int WC_BS_LL = B_Y_values_LL.get(B_Y_values_LL.size() - 1);
            int WC_MS_AL = M_Y_values_AL.get(M_Y_values_AL.size() - 1);
            int WC_MS_LL = M_Y_values_LL.get(M_Y_values_LL.size() - 1);

            eng.eval("X = [1,2]");
            eng.putVariable("I_AL", WC_IS_AL);
            eng.putVariable("I_LL", WC_IS_LL);
            eng.putVariable("B_AL", WC_BS_AL);
            eng.putVariable("B_LL", WC_BS_LL);
            eng.putVariable("M_AL", WC_MS_AL);
            eng.putVariable("M_AL", WC_MS_LL);

            eng.eval("X = categorical({'Insertion Sort','Bubble Sort','Merge Sort'});");
            eng.eval("X = reordercats(X,{'Insertion Sort','Bubble Sort','Merge Sort'});");

            eng.eval("a = [I_AL B_AL M_AL]");
            eng.eval("t = [I_LL B_LL M_AL]");
            eng.eval("Y = [a; t];");

            eng.eval("bar(X,Y)");

            eng.eval("legend({'ArrayList','LinkedList'},'Location','northwest')");

            eng.eval("grid on");

            eng.eval("title('Worst Case Time Complexity')");
            eng.eval("xlabel('Number of Elements')");
            eng.eval("ylabel('Comparison Count')");

        } catch (MatlabSyntaxException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CancellationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private static MatlabEngine eng;

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    public Main(ArrayList<Data> id, ArrayList<Data> title, ArrayList<Data> author, ArrayList<Data> A_rating,
            ArrayList<Data> isbn, ArrayList<Data> isbn13, ArrayList<Data> l_code, ArrayList<Data> Num_pg, ArrayList<Data> Rating,
            ArrayList<Data> txt_Review, ArrayList<Data> publication, ArrayList<Data> publisher) {

        model.setColumnIdentifiers(headers);
        table.setModel(model);
        scroll = new JScrollPane(table);

        insert(id, title, author, A_rating, isbn, isbn13, l_code, Num_pg, Rating, txt_Review, publication, publisher);

        add(scroll, BorderLayout.CENTER);
        setSize(1200, 600);
        setVisible(true);
    }

    public void insert(List<Data> id, List<Data> title, List<Data> author, List<Data> A_rating, List<Data> isbn, List<Data> isbn13,
            List<Data> l_code, List<Data> Num_pg, List<Data> Rating, List<Data> txt_Review, List<Data> publication, List<Data> publisher) {

        int u = id.size() - 1;

        for (int i = 0; i < u; i++) {
            model.addRow(new Object[]{String.valueOf(id.get(i).getData()),
                String.valueOf(title.get((i)).getValue()),
                String.valueOf(author.get((i)).getValue()),
                String.valueOf(A_rating.get((i)).getValue()),
                String.valueOf(isbn.get((i)).getValue()),
                String.valueOf(isbn13.get((i)).getValue()),
                String.valueOf(l_code.get((i)).getValue()),
                String.valueOf(Num_pg.get((i)).getValue()),
                String.valueOf(Rating.get((i)).getValue()),
                String.valueOf(txt_Review.get((i)).getValue()),
                String.valueOf(publication.get((i)).getValue()),
                String.valueOf(publisher.get((i)).getValue())});
        }
    }

    public Main(List<Integer> Function_Calls) {

        model1.setColumnIdentifiers(headers1);
        table1.setModel(model1);
        scroll1 = new JScrollPane(table1);

        insert1(Function_Calls);

        add(scroll1, BorderLayout.CENTER);
        setSize(300, 400);
        setVisible(true);
    }

    public void insert1(List<Integer> Results) {
        int Size = Results.size();

        List<Integer> Function_Calls = new ArrayList<>();
        for (int i = 1; i <= Size; i++) {
            Function_Calls.add(i);
        }

        for (int i = 0; i <= Size - 1; i++) {
            model1.addRow(new Object[]{String.valueOf(Function_Calls.get(i)),
                String.valueOf(Results.get((i)))});
        }
    }

    //used to divide data(40%)
    public void Cal_A(ArrayList<Data> tmp) {
        for (int i = 0; i < (A_bookID.size() / 10); i++) {
            tmp.add(A_bookID.get(i));
        }
    }

    public void Cal_L(LinkedList<Data> tmp) {
        for (int i = 0; i <= (L_bookID.size() / 10); i++) {
            tmp.add(L_bookID.get(i));
        }
    }

    public int IS_Graph_AL(double size) {
        Gph_IS_AL.clear();

        for (int i = 0; i < (AL_BookID_IS.size() * size); i++) {
            Gph_IS_AL.add(AL_BookID_IS.get(i));
        }
        Collections.shuffle(Gph_IS_AL);
        I_sort_AL.InsertionSort(Gph_IS_AL);
        I_AL_Gph_counter.add(I_sort_AL.counter_I);

        return I_sort_AL.counter_I;
    }

    public int IS_Graph_LL(double size) {
        Gph_IS_LL.clear();

        for (int i = 0; i < (LL_BookID_IS.size() * size); i++) {
            Gph_IS_LL.add(LL_BookID_IS.get(i));
        }
        Collections.shuffle(Gph_IS_LL);
        I_sort_LL.InsertionSort(Gph_IS_LL);
        I_LL_Gph_counter.add(I_sort_LL.counter_I);
        return I_sort_LL.counter_I;
    }

    public int BS_Graph_AL(double size) {
        Gph_BS_AL.clear();

        for (int i = 0; i < (AL_BookID_BS.size() * size); i++) {
            Gph_BS_AL.add(AL_BookID_BS.get(i));
        }
        Collections.shuffle(Gph_BS_AL);
        B_sort_AL.bubbleSort(Gph_BS_AL);
        B_AL_Gph_counter.add(B_sort_AL.counter_B);
        return B_sort_AL.counter_B;
    }

    public int BS_Graph_LL(double size) {
        Gph_BS_LL.clear();

        for (int i = 0; i < (LL_BookID_BS.size() * size); i++) {
            Gph_BS_LL.add(LL_BookID_BS.get(i));
        }
        Collections.shuffle(Gph_BS_LL);
        B_sort_LL.bubbleSort(Gph_BS_LL);
        B_LL_Gph_counter.add(B_sort_LL.counter_B);
        return B_sort_LL.counter_B;
    }

    public int MS_Graph_AL(double size) {
        Gph_MS_AL.clear();

        for (int i = 0; i < (AL_BookID_MS.size() * size); i++) {
            Gph_MS_AL.add(AL_BookID_MS.get(i));
        }
        Collections.shuffle(Gph_MS_AL);
        M_sort_AL.mergeSort_AL(Gph_MS_AL);
        M_AL_Gph_counter.add(M_sort_AL.counter_M);
        return M_sort_AL.counter_M;
    }

    public int MS_Graph_LL(double size) {
        Gph_MS_LL.clear();

        for (int i = 0; i < (LL_BookID_MS.size() * size); i++) {
            Gph_MS_LL.add(LL_BookID_MS.get(i));
        }
        Collections.shuffle(Gph_MS_LL);
        M_sort_LL.mergeSort_LL(Gph_MS_LL);
        M_LL_Gph_counter.add(M_sort_LL.counter_M);
        return M_sort_LL.counter_M;
    }

    //Empircal Testing
    //Insertion sort
    public void test_IS(List<Data> Books, List<Integer> Counter, Insertion_Sort List) {
        //  List.counter_I = 0;
        for (int i = 0; i < 30; i++) {
            //Random function
            Collections.shuffle(Books);
            //calling a function
            List.InsertionSort(Books);
            //Storing counter values
            Counter.add(List.counter_I);
        }
    }

    //Bubble sort
    public void test_BS(List<Data> Books, List<Integer> Counter, Bubble_Sort List) {
        for (int i = 0; i < 30; i++) {
            //Random function
            Collections.shuffle(Books);
            //calling a function
            List.bubbleSort(Books);
            //Storing counter values
            Counter.add(List.counter_B);
        }
    }

    //Bubble sort(ArrayList>
    public void test_MS(List<Data> Books, List<Integer> Counter, Merge_Sort List) {
        for (int i = 0; i < 30; i++) {
            //Random function
            Collections.shuffle(Books);
            //calling a function
            List.mergeSort_AL(Books);
            //Storing counter values
            Counter.add(List.counter_M);
        }
    }

    //Bubble sort(ArrayList>
    public void test_M(List<Data> Books, List<Integer> Counter, Merge_Sort List) {
        for (int i = 0; i < 30; i++) {
            //Random function
            Collections.shuffle(Books);
            //calling a function
            List.mergeSort_LL(Books);
            //Storing counter values
            Counter.add(List.counter_M);
        }
    }

    //Empirical testing
    public void analyse(List<Integer> Y_Values, List<Integer> Counter_Values) {
        int Tmp = -1;
        //analying counter values (Insertion Sort)
        Y_Values.add(0, Counter_Values.get(0));
        for (int i = 1; i <= Counter_Values.size() - 1; i++) {
            Tmp = Counter_Values.get(i - 1) - Counter_Values.get(i);
            Y_Values.add(i, (-(Tmp)));
        }
        Y_Values.remove(0);
        Y_Values.remove(Y_Values.size() - 1);
        //sorting counter values (smallest to largest) => for calculating best,mean and worst
        Collections.sort(Y_Values);
        Y_Values.remove(Y_Values.size() - 1);
    }

    //Racing Algorithms
    public void Analyse(List<Integer> Y_Values, List<Integer> Counter_Values) {
        int Tmp = -1;

        Y_Values.add(0, Counter_Values.get(0));
        for (int i = 1; i <= Counter_Values.size() - 1; i++) {
            Tmp = Counter_Values.get(i - 1) - Counter_Values.get(i);
            Y_Values.add(i, (-(Tmp)));
        }
    }

    //X-Values
    public void X_Values(int size, List<Integer> Value, List<Data> Limit) {
        int Size = Limit.size() - 1;
        for (int i = 0; i <= Size; i++) {
            if (i % size == 0) {
                Value.add(i);
            }
        }
        Value.remove(0);
    }

    public int avg(List<Integer> counter_Values, int sum) {
        for (int i : counter_Values) {
            //adds elements to the variable sum  
            sum += i;
        }
        return sum;
    }
}

class greet implements Runnable {

    private int greeting;

    public greet(int greeting) {
        this.greeting = greeting;
    }

    public void run() {
        try {
            // System.out.println(greeting);
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(greet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

//Data class
class Data<T> implements Comparable {

    T id;
    int u;

    public Data() {
    }

    public Data(T id) {
        this.id = id;
    }

    public T getValue() {
        return this.id;
    }

    public void set(int u) {
        this.u = u;
    }

    public int getData() {
        return this.u;
    }

    // Getters and setters
    @Override
    public int compareTo(Object obj) {
        int res = 0;
        Data s = (Data) obj; //invalid downcasting

        if (this.u < s.getData()) {
            res = -1;
        }
        if (this.u > s.getData()) {
            res = 1;
        }
        return res;
    }
}

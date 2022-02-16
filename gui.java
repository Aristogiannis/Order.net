package test_app;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;

public class gui extends JFrame {
   public static Scanner x;
   Image image = ImageIO.read(this.getClass().getResource("net.png"));
   String String_id;
   String menuitem;
   String menuprice;
   int id_edit;
   String place_in;
   static String path1;
   static String check;
   static String check_bill;
   static String data;
   private JCheckBox Popular_box;
   private JButton add_btn;
   private JCheckBox appetizers_box;
   private static TextArea bill;
   private JCheckBox desserts_box;
   private JCheckBox drinks_box;
   private JButton edit_tbn;
   private JTextField item_menu;
   private JDialog jDialog1;
   private JFrame jFrame1;
   private JLabel jLabel10;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JLabel jLabel5;
   private JLabel jLabel6;
   private JLabel jLabel7;
   private JLabel jLabel8;
   private JLabel jLabel9;
   private JMenu jMenu1;
   private static JLabel last_edit;
   private static JTextField new_id;
   private static TextArea ord;
   private static JButton path;
   private static JTextField path_in;
   private static JTextField price_menu;
   private JCheckBox sides_box;
   private static String string;

   private static File File(String cUsersaristDesktopNew_MenuTest_1txt) {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   public gui() throws IOException {
      this.initComponents();
      this.setIconImage(this.image);
   }

   private void initComponents() {
      this.jFrame1 = new JFrame();
      this.jDialog1 = new JDialog();
      this.jMenu1 = new JMenu();
      this.edit_tbn = new JButton();
      price_menu = new JTextField();
      this.item_menu = new JTextField();
      this.add_btn = new JButton();
      new_id = new JTextField();
      this.jLabel2 = new JLabel();
      this.jLabel3 = new JLabel();
      this.jLabel4 = new JLabel();
      this.jLabel5 = new JLabel();
      this.jLabel6 = new JLabel();
      last_edit = new JLabel();
      this.Popular_box = new JCheckBox();
      this.appetizers_box = new JCheckBox();
      this.drinks_box = new JCheckBox();
      this.desserts_box = new JCheckBox();
      this.sides_box = new JCheckBox();
      path_in = new JTextField();
      this.jLabel7 = new JLabel();
      path = new JButton();
      this.jLabel8 = new JLabel();
      this.jLabel10 = new JLabel();
      bill = new TextArea();
      ord = new TextArea();
      this.jLabel9 = new JLabel();
      GroupLayout jFrame1Layout = new GroupLayout(this.jFrame1.getContentPane());
      this.jFrame1.getContentPane().setLayout(jFrame1Layout);
      jFrame1Layout.setHorizontalGroup(jFrame1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 400, 32767));
      jFrame1Layout.setVerticalGroup(jFrame1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 300, 32767));
      GroupLayout jDialog1Layout = new GroupLayout(this.jDialog1.getContentPane());
      this.jDialog1.getContentPane().setLayout(jDialog1Layout);
      jDialog1Layout.setHorizontalGroup(jDialog1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 400, 32767));
      jDialog1Layout.setVerticalGroup(jDialog1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 300, 32767));
      this.jMenu1.setText("jMenu1");
      this.setDefaultCloseOperation(3);
      this.setTitle("Order.net");
      this.setName("Order.net");
      this.setSize(new Dimension(1000, 1000));
      this.edit_tbn.setFont(new Font("Segoe UI", 0, 14));
      this.edit_tbn.setText("Submit Edited Menu");
      this.edit_tbn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            gui.this.edit_tbnActionPerformed(evt);
         }
      });
      price_menu.setFont(new Font("Tahoma", 0, 16));
      price_menu.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            gui.this.price_menuActionPerformed(evt);
         }
      });
      price_menu.addKeyListener(new KeyAdapter() {
         public void keyTyped(KeyEvent evt) {
            gui.this.price_menuKeyTyped(evt);
         }
      });
      this.item_menu.setFont(new Font("Tahoma", 0, 16));
      this.item_menu.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            gui.this.item_menuActionPerformed(evt);
         }
      });
      this.add_btn.setFont(new Font("Segoe UI", 0, 14));
      this.add_btn.setText("Submit New Item");
      this.add_btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            gui.this.add_btnActionPerformed(evt);
         }
      });
      new_id.setFont(new Font("Tahoma", 0, 16));
      new_id.setToolTipText("");
      new_id.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            gui.this.new_idActionPerformed(evt);
         }
      });
      this.jLabel2.setFont(new Font("Tahoma", 0, 16));
      this.jLabel2.setText("ID");
      this.jLabel2.setPreferredSize(new Dimension(10, 16));
      this.jLabel3.setFont(new Font("Tahoma", 0, 16));
      this.jLabel3.setText("Name");
      this.jLabel4.setFont(new Font("Tahoma", 0, 16));
      this.jLabel4.setText("Price");
      this.jLabel5.setFont(new Font("Rockwell", 0, 24));
      this.jLabel5.setText("Live Order List");
      this.jLabel5.setAlignmentX(3.0F);
      this.jLabel5.setAlignmentY(5.0F);
      this.jLabel5.setIconTextGap(7);
      this.jLabel6.setFont(new Font("Rockwell", 1, 18));
      this.jLabel6.setText("Add Or Edit Items In Your Menu For Your Site");
      last_edit.setFont(new Font("Arial", 0, 14));
      this.Popular_box.setFont(new Font("Copperplate Gothic Bold", 0, 14));
      this.Popular_box.setText("Popular");
      this.Popular_box.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            gui.this.Popular_boxActionPerformed(evt);
         }
      });
      this.appetizers_box.setFont(new Font("Copperplate Gothic Bold", 0, 14));
      this.appetizers_box.setText("Appetizers");
      this.appetizers_box.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            gui.this.appetizers_boxActionPerformed(evt);
         }
      });
      this.drinks_box.setFont(new Font("Copperplate Gothic Bold", 0, 14));
      this.drinks_box.setText("Drinks");
      this.drinks_box.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            gui.this.drinks_boxActionPerformed(evt);
         }
      });
      this.desserts_box.setFont(new Font("Copperplate Gothic Bold", 0, 14));
      this.desserts_box.setText("Desserts ");
      this.desserts_box.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            gui.this.desserts_boxActionPerformed(evt);
         }
      });
      this.sides_box.setFont(new Font("Copperplate Gothic Bold", 0, 14));
      this.sides_box.setText("Sides");
      this.sides_box.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            gui.this.sides_boxActionPerformed(evt);
         }
      });
      path_in.setFont(new Font("Tahoma", 0, 16));
      path_in.setText("C:\\\\Users\\arist\\\\Desktop\\\\New_Menu\\\\Menu.txt");
      path_in.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            gui.this.path_inActionPerformed(evt);
         }
      });
      this.jLabel7.setFont(new Font("Tahoma", 0, 16));
      this.jLabel7.setText("File Path");
      path.setIcon(new ImageIcon(this.getClass().getResource("/test_app/folder.png")));
      path.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            gui.this.pathActionPerformed(evt);
         }
      });
      this.jLabel8.setFont(new Font("Rockwell", 0, 24));
      this.jLabel8.setText("Bill Alert");
      this.jLabel10.setText("jLabel10");
      ord.setFont(new Font("Arial", 0, 14));
      this.jLabel9.setIcon(new ImageIcon(this.getClass().getResource("/test_app/logo_app.png")));
      this.jLabel9.setText("jLabel9");
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING, layout.createSequentialGroup().addGap(165, 165, 165).addComponent(this.edit_tbn).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.add_btn, -2, 165, -2).addGap(207, 207, 207)).addGroup(Alignment.LEADING, layout.createSequentialGroup().addContainerGap().addComponent(last_edit, -2, 239, -2).addContainerGap(-1, 32767)).addGroup(Alignment.LEADING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel2, Alignment.TRAILING, -2, 42, -2).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel3).addGap(3, 3, 3))).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel4, -2, 43, -2).addComponent(this.jLabel7)))).addGap(20, 20, 20).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(new_id).addComponent(this.item_menu).addComponent(price_menu)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.sides_box, -2, 79, -2).addComponent(this.appetizers_box).addComponent(this.drinks_box, -2, 79, -2).addComponent(this.Popular_box).addComponent(this.desserts_box)).addGap(3, 3, 3)).addGroup(layout.createSequentialGroup().addComponent(path_in, -2, 337, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(path, -2, 18, -2).addPreferredGap(ComponentPlacement.RELATED, -1, 32767))).addComponent(ord, -2, 800, -2).addGap(10, 10, 10)).addGroup(layout.createSequentialGroup().addGap(53, 53, 53).addComponent(this.jLabel6).addPreferredGap(ComponentPlacement.RELATED, -1, 32767))).addComponent(bill, -2, 178, -2)).addGroup(layout.createSequentialGroup().addContainerGap(972, 32767).addComponent(this.jLabel5, -2, 186, -2).addGap(223, 223, 223).addComponent(this.jLabel8).addGap(44, 44, 44)).addComponent(this.jLabel9, -2, 0, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel8, -2, 29, -2).addComponent(this.jLabel5, -2, 29, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(bill, -1, -1, 32767).addComponent(ord, -1, -1, 32767))).addGroup(layout.createSequentialGroup().addGap(50, 50, 50).addComponent(this.jLabel6, -2, 30, -2).addGap(18, 18, 18).addGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(path_in, -2, -1, -2).addComponent(this.jLabel7, -2, 20, -2)).addComponent(path, -2, 16, -2)).addGap(27, 27, 27).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(new_id, -2, -1, -2).addComponent(this.jLabel2, -2, -1, -2)).addGap(29, 29, 29).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.item_menu, -2, -1, -2).addComponent(this.jLabel3)).addGap(30, 30, 30).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(price_menu, -2, -1, -2).addComponent(this.jLabel4))).addGroup(layout.createSequentialGroup().addComponent(this.Popular_box).addGap(1, 1, 1).addComponent(this.desserts_box).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.appetizers_box).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.sides_box).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.drinks_box, -2, 21, -2))).addPreferredGap(ComponentPlacement.RELATED, 149, 32767).addComponent(last_edit))).addGap(22, 22, 22).addComponent(this.jLabel9, -2, 126, -2).addGap(18, 18, 18).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.edit_tbn, -2, 54, -2).addComponent(this.add_btn, -2, 54, -2)).addGap(26, 26, 26)));
      this.pack();
   }

   private void edit_tbnActionPerformed(ActionEvent evt) {
      this.menuitem = this.item_menu.getText();
      this.menuprice = price_menu.getText();
      this.String_id = new_id.getText();
      if (" ".equals(this.String_id) || "".equals(this.String_id)) {
         this.String_id = "000";
      }

      this.id_edit = Integer.parseInt(this.String_id);
      if ("000".equals(this.String_id)) {
         JOptionPane.showMessageDialog(this.rootPane, "No Id Found, Chceck The Id Again", "Something Went Wrong", 2);
      } else {
         try {
            String fpath = path_in.getText();
            edit_menu(fpath, this.id_edit, this.menuitem, this.menuprice, this.place_in);
            this.Popular_box.setSelected(false);
            this.desserts_box.setSelected(false);
            this.sides_box.setSelected(false);
            this.drinks_box.setSelected(false);
            this.appetizers_box.setSelected(false);
            this.sides_box.setEnabled(true);
            this.desserts_box.setEnabled(true);
            this.Popular_box.setEnabled(true);
            this.appetizers_box.setEnabled(true);
            this.drinks_box.setEnabled(true);
            this.item_menu.setText("");
            price_menu.setText("");
            new_id.setText("");
         } catch (FileNotFoundException var3) {
            JOptionPane.showMessageDialog(this.rootPane, "File not found \nSupport at aristogiannisphilippis@gmail.com", "Something Went Wrong", 2);
         } catch (IOException | IOExceptionstatic var4) {
            Logger.getLogger(gui.class.getName()).log(Level.SEVERE, (String)null, var4);
         }

         date();
      }

   }

   private void price_menuActionPerformed(ActionEvent evt) {
   }

   private void item_menuActionPerformed(ActionEvent evt) {
   }

   private void add_btnActionPerformed(ActionEvent evt) {
      this.menuitem = this.item_menu.getText();
      this.menuprice = price_menu.getText();
      this.String_id = new_id.getText();
      if (!"".equals(this.String_id) && !" ".equals(this.String_id)) {
         try {
            add1_menu();
            this.Popular_box.setSelected(false);
            this.desserts_box.setSelected(false);
            this.sides_box.setSelected(false);
            this.drinks_box.setSelected(false);
            this.appetizers_box.setSelected(false);
            this.sides_box.setEnabled(true);
            this.desserts_box.setEnabled(true);
            this.Popular_box.setEnabled(true);
            this.appetizers_box.setEnabled(true);
            this.drinks_box.setEnabled(true);
            this.item_menu.setText("");
            price_menu.setText("");
            new_id.setText("");
         } catch (FileNotFoundException var3) {
            Logger.getLogger(gui.class.getName()).log(Level.SEVERE, (String)null, var3);
            JOptionPane.showMessageDialog(this.rootPane, "File not found, Check the file path \nSupport at aristogiannisphilippis@gmail.com", "Something Went Wrong", 2);
         }

         add2_menu(this.String_id, this.menuitem, this.menuprice, this.place_in);
         date();
      } else {
         JOptionPane.showMessageDialog(this.rootPane, "No Id Found, Chceck The Id Again", "Something Went Wrong", 2);
      }

   }

   private void new_idActionPerformed(ActionEvent evt) {
   }

   private void drinks_boxActionPerformed(ActionEvent evt) {
      this.place_in = "Drinks";
      if (this.drinks_box.isSelected()) {
         this.sides_box.setEnabled(false);
         this.desserts_box.setEnabled(false);
         this.Popular_box.setEnabled(false);
         this.appetizers_box.setEnabled(false);
      } else {
         this.sides_box.setEnabled(true);
         this.desserts_box.setEnabled(true);
         this.Popular_box.setEnabled(true);
         this.appetizers_box.setEnabled(true);
      }

   }

   private void sides_boxActionPerformed(ActionEvent evt) {
      this.place_in = "Sides";
      if (this.sides_box.isSelected()) {
         this.drinks_box.setEnabled(false);
         this.desserts_box.setEnabled(false);
         this.Popular_box.setEnabled(false);
         this.appetizers_box.setEnabled(false);
      } else {
         this.drinks_box.setEnabled(true);
         this.desserts_box.setEnabled(true);
         this.Popular_box.setEnabled(true);
         this.appetizers_box.setEnabled(true);
      }

   }

   private void desserts_boxActionPerformed(ActionEvent evt) {
      this.place_in = "Desserts";
      if (this.desserts_box.isSelected()) {
         this.sides_box.setEnabled(false);
         this.drinks_box.setEnabled(false);
         this.Popular_box.setEnabled(false);
         this.appetizers_box.setEnabled(false);
      } else {
         this.sides_box.setEnabled(true);
         this.drinks_box.setEnabled(true);
         this.Popular_box.setEnabled(true);
         this.appetizers_box.setEnabled(true);
      }

   }

   private void appetizers_boxActionPerformed(ActionEvent evt) {
      this.place_in = "Appetizers";
      if (this.appetizers_box.isSelected()) {
         this.sides_box.setEnabled(false);
         this.desserts_box.setEnabled(false);
         this.Popular_box.setEnabled(false);
         this.drinks_box.setEnabled(false);
      } else {
         this.sides_box.setEnabled(true);
         this.desserts_box.setEnabled(true);
         this.Popular_box.setEnabled(true);
         this.drinks_box.setEnabled(true);
      }

   }

   private void Popular_boxActionPerformed(ActionEvent evt) {
      this.place_in = "Popular";
      if (this.Popular_box.isSelected()) {
         this.sides_box.setEnabled(false);
         this.desserts_box.setEnabled(false);
         this.drinks_box.setEnabled(false);
         this.appetizers_box.setEnabled(false);
      } else {
         this.sides_box.setEnabled(true);
         this.desserts_box.setEnabled(true);
         this.drinks_box.setEnabled(true);
         this.appetizers_box.setEnabled(true);
      }

   }

   private void path_inActionPerformed(ActionEvent evt) {
   }

   private void price_menuKeyTyped(KeyEvent evt) {
      char c = evt.getKeyChar();
      if (!Character.isDigit(c) && c != '\b' && c != 127 && c != '.') {
         evt.consume();
         JOptionPane.showMessageDialog(this.rootPane, "Not a Valid Character, Only Numbers Accepted");
      }

   }

   private void pathActionPerformed(ActionEvent evt) {
      JFileChooser chooser = new JFileChooser();
      chooser.showOpenDialog((Component)null);
      File f2 = chooser.getSelectedFile();
      String f3 = f2.toString();
      path_in.setText(f3);
   }

   public static void main(String[] args) throws Exception {
      try {
         LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            LookAndFeelInfo info = var1[var3];
            if ("Nimbus".equals(info.getName())) {
               UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException var6) {
         Logger.getLogger(gui.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (InstantiationException var7) {
         Logger.getLogger(gui.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (IllegalAccessException var8) {
         Logger.getLogger(gui.class.getName()).log(Level.SEVERE, (String)null, var8);
      } catch (UnsupportedLookAndFeelException var9) {
         Logger.getLogger(gui.class.getName()).log(Level.SEVERE, (String)null, var9);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               (new gui()).setVisible(true);
            } catch (IOException var2) {
               Logger.getLogger(gui.class.getName()).log(Level.SEVERE, (String)null, var2);
            }

         }
      });

      while(true) {
         try {
            get_req();
            get_bill();
         } catch (Exception var5) {
            var5.printStackTrace();
            System.out.println("Time to look the code again");
         }

         TimeUnit.SECONDS.sleep(3L);
      }
   }

   public static void add1_menu() throws FileNotFoundException {
      path1 = path_in.getText().toString();
      File file = new File(path1);
      Scanner sc = new Scanner(file);
      sc.useDelimiter("\\Z");
      data = sc.next();
      System.out.println(data);
   }

   public static void add2_menu(String new_id, String new_val, String new_price, String place) {
      try {
         path1 = path_in.getText().toString();
         File file1 = new File(path1);
         file1.createNewFile();
         FileWriter fw = new FileWriter(file1);
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write(data);
         bw.write("\n" + new_id + "," + new_val + "," + new_price + "," + place + "!");
         bw.flush();
         FileReader fr = new FileReader(file1);
         BufferedReader br = new BufferedReader(fr);
         br.close();
         bw.close();
      } catch (IOException var9) {
         var9.printStackTrace();
      }

   }

   public static void edit_menu(String path_edit, int id, String item, String price_edit, String place1) throws IOExceptionstatic, FileNotFoundException, IOException {
      String newName = null;
      String newQuantity = null;
      String newPlace = null;
      boolean checked = true;
      File f = new File(path_edit);
      File tempFile = new File(path_edit + "temp.txt");
      BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

      try {
         Scanner sc;
         String currentLine;
         for(sc = new Scanner(f); sc.hasNextLine(); writer.write(currentLine + System.getProperty("line.separator"))) {
            currentLine = sc.nextLine();
            String[] tokens = currentLine.split(",");
            if (Integer.valueOf(tokens[0]) == id && checked) {
               currentLine = tokens[0] + "," + item + "," + price_edit + "," + place1 + "!";
               checked = false;
            }
         }

         writer.close();
         sc.close();
         f.delete();
         tempFile.renameTo(f);
      } catch (Throwable var16) {
         try {
            writer.close();
         } catch (Throwable var15) {
            var16.addSuppressed(var15);
         }

         throw var16;
      }

      writer.close();
   }

   public static void get_req() throws Exception {
      try {
         String url = "http://127.0.0.1:5000/all";
         URL obj = new URL(url);
         HttpURLConnection con = (HttpURLConnection)obj.openConnection();
         con.setRequestMethod("GET");
         con.setRequestProperty("Content-Type", "application/json");
         int responseCode = con.getResponseCode();
         BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
         StringBuffer response = new StringBuffer();

         String inputLine;
         while((inputLine = in.readLine()) != null) {
            response.append(inputLine);
         }

         new SimpleDateFormat("HH:mm:ss");
         new Date();
         String Sord = response.toString().replace("\\", "").replace("u0391", "Α").replace("u0392", "Β").replace("u0393", "Γ").replace("u0394", "Δ").replace("u0395", "Ε").replace("u0396", "Ζ").replace("u0397", "Η").replace("u0398", "Θ").replace("u0399", "Ι").replace("u039a", "Κ").replace("u039b", "Λ").replace("u039c", "Μ").replace("u039d", "Ν").replace("u039e", "Ξ").replace("u039f", "Ο").replace("u03a0", "Π").replace("u03a1", "Ρ").replace("u03a3", "Σ").replace("u03a4", "Τ").replace("u03a5", "Υ").replace("u03a6", "Φ").replace("u03a7", "Χ").replace("u03a8", "Ψ").replace("u03a9", "Ω");
         String[] orders = Sord.split("\",");
         int len = orders.length;
         if (!"[]".equals(Sord)) {
            ord.setText((String)null);

            for(int i = 0; i < len; ++i) {
               ord.append(orders[i] + "\n");
            }
         }
      } catch (IOException var13) {
      }

   }

   public static void get_bill() throws MalformedURLException, ProtocolException, IOException {
      String url = "http://127.0.0.1:5000/bill/all";
      URL obj = new URL(url);
      HttpURLConnection con = (HttpURLConnection)obj.openConnection();

      try {
         con.setRequestMethod("GET");
      } catch (ProtocolException var13) {
         Logger.getLogger(gui.class.getName()).log(Level.SEVERE, (String)null, var13);
      }

      con.setRequestProperty("Content-Type", "application/json");

      try {
         int var3 = con.getResponseCode();
      } catch (IOException var12) {
         Logger.getLogger(gui.class.getName()).log(Level.SEVERE, (String)null, var12);
      }

      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      StringBuffer response1 = new StringBuffer();

      String inputLine;
      while((inputLine = in.readLine()) != null) {
         response1.append(inputLine);
      }

      SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
      Date date = new Date();
      String Sord1 = response1.toString();
      String[] bills = Sord1.split(",");
      int len = bills.length;
      if (!"[]".equals(Sord1)) {
         bill.setText((String)null);

         for(int i = 0; i < len; ++i) {
            bill.append("Table: " + bills[i] + " at: " + sdf.format(date) + "\n");
         }
      }

   }

   public static void date() {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      Date date = new Date();
      JLabel var10000 = last_edit;
      String var10001 = sdf.format(date);
      var10000.setText("Last update today: " + var10001);
   }

   public static String getString() {
      return string;
   }

   public static void setString(String string) {
      gui.string = string;
   }
}

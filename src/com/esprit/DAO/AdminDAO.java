/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.esprit.DAO;

import com.esprit.GUI.AdminGui;
import com.esprit.GUI.Page_responsable;
import com.esprit.GUI.afficher_pack;
import com.esprit.IDAO.IadminDAO;
import com.esprit.Util.db_connection;
import com.esprit.entites.ImageProfil;
import com.esprit.entites.fos_user;
import com.esprit.entites.image;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 
/**
 *
 * @author snoussi
 */
public class AdminDAO extends IadminDAO{

    private Connection cnx;
     Statement stm;
       db_connection conn=new db_connection();
     
       DefaultTableModel model = new DefaultTableModel();
           ResultSet Rs;
            boolean txtradio=false;
            String nom;
        public static     String nomp;
         public static      String prenomp;
              public static  String mail;
              public static  Blob imgprofil;
                 public static  int cin1;
             public static   Boolean profile1 = false ;
             public static String cincompte ; 
              
   //       static  String mail12;
                boolean rbtn1 ;
           int  cin;
                static  int  i ;
  
     
   public AdminDAO() {
     
        cnx= db_connection.getInstance();
        
   }

    public static Blob getImgprofil() {
        return imgprofil;
    }

    public static void setImgprofil(Blob imgprofil) {
        AdminDAO.imgprofil = imgprofil;
    }



    public static String getNomp() {
        return nomp;
    }

    public static void setNomp(String nomp) {
        AdminDAO.nomp = nomp;
    }

    public static String getPrenomp() {
        return prenomp;
    }

    public static void setPrenomp(String prenomp) {
        AdminDAO.prenomp = prenomp;
    }
    public AdminDAO(String mail12) {
     mail12= this.mail;
      
   }

    public static int getCin1() {
        return cin1;
    }

    public static void setCin1(int cin1) {
        AdminDAO.cin1 = cin1;
    }

   

    public static String getMail() {
        return mail;
    }

    public static void setMail(String mail) {
        AdminDAO.mail = mail;
    }

   public void supprimer(String txtid) {
        try {
stm=conn.obtenirconnexion().createStatement();
ResultSet res=stm.executeQuery("Select * from fos_user");
while(res.next()){
model.addRow(new Object[]{res.getString("id"),res.getString("Nom"),res.getString("prenom"),
    res.getString("password"),res.getString("email"),res.getString("roles")});

}}catch(SQLException e){System.err.println(e);}
       
       
           try {
             if(JOptionPane.showConfirmDialog(null,"attention vous avez supprimer un client,est ce que tu et sure?"
                     ,"supprimer client",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
         
            if(txtid.length() != 0){
    //   stm.executeUpdate("Delete From user");
         stm.executeUpdate("Delete From fos_user where id = "+txtid);
             }//ca est pour recharger la list des stagiaire
            else { JOptionPane.showMessageDialog(null,"veuillez remplire le champ id !");}
        
        }catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de supprimer \n"+e.getMessage());}
        // TODO add your handling code here:
   }
     public void modifier(String txtrole,String txtcin) {
         try {
stm=conn.obtenirconnexion().createStatement();
ResultSet res=stm.executeQuery("Select * from fos_user");
while(res.next()){
model.addRow(new Object[]{res.getString("id"),res.getString("Nom"),res.getString("prenom"),
    res.getString("password"),res.getString("email"),res.getString("roles")});

}}catch(SQLException e){System.err.println(e);}
       
       
            try { 
            if (JOptionPane.showConfirmDialog (null,"confirmer la modification","modification",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

                stm.executeUpdate("UPDATE fos_user SET roles='"+txtrole+"' WHERE id= "+txtcin);
               //afficher ();
            } 
        } catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de modifier !!!!!!!");
        System.err.println(e);}
        // TODO add your handling code here:
   }
     
     
     
        public void modifiercompte(String nom,String prenom,String mail,String pwd,String Cin) {

                    try {
stm=conn.obtenirconnexion().createStatement();
ResultSet res=stm.executeQuery("Select * from fos_user WHERE id= "+cin );
while(res.next()){
model.addRow(new Object[]{res.getString("id"),res.getString("Nom"),res.getString("prenom"),
    res.getString("password"),res.getString("email"),res.getString("roles")});

}}catch(SQLException e){System.err.println(e);}          
                     
        try { 
            if (JOptionPane.showConfirmDialog (null,"confirmer la modification","modification",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

                stm.executeUpdate("UPDATE fos_user SET nom='"+nom+"',prenom='"+prenom+
                        "',email='"+mail+"',password='"+pwd+
                        "' WHERE id= "+Cin);
             //   afficher();
           
            } 
        } catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de modifier !!!!!!!"+e.getMessage());
        System.err.println(e);}
        
        
        
        
        
        }
      public void rechercher(String txtrecherche) {
         
            try {
          model.setRowCount(0);// pour vider la list des client
     if(rbtn1){ //radio btn matriricule 
     // Rs = stm.executeQuery("Select * From user WHERE role = "+txtre.getText());
          }else {
       Rs = stm.executeQuery("Select * From fos_user WHERE id = '"+txtrecherche+"'");
       }while (Rs.next()){
  
             
     Object [] user ={Rs.getInt(1),Rs.getString(2),Rs.getString(3),Rs.getString(4),Rs.getString(5),Rs.getString(6)};
   model.addRow(user);
       } if (model.getRowCount () == 0){JOptionPane.showMessageDialog(null,"il y a aucun client");
//      
          } else{  //int i=0;  
        //  deplace(1);
//          
//     // txtbr.setSelectedItem(model.getValueAt(5,5).toString());
      
////    
       }
       }catch (Exception e) { System.err.println(e);
      JOptionPane.showMessageDialog(null,e.getMessage());}}
    
//              try {
//           model.setRowCount(0);// pour vider la list des client
//     if( txtradio){ //radio btn matriricule 
//     //  Rs = stm.executeQuery("Select * From user WHERE role = "+txtre.getText());
//           }
//      else {
//       Rs = stm.executeQuery("Select * From user WHERE cin = '"+txtrecherche+"'");
//       }while (Rs.next()){
//       
//       Object [] client ={Rs.getInt(1),Rs.getString(2),Rs.getString(3),Rs.getString(4),Rs.getString(5),Rs.getString(6)};
//     model.addRow(client);
//      } if (model.getRowCount () == 0){JOptionPane.showMessageDialog(null,"il y a aucun client");
//      
//     // } else{  int i=0;  deplace(i);
//          
//     // txtbr.setSelectedItem(model.getValueAt(5,5).toString());
//       }
////       
//       }catch (Exception e) { System.err.println(e);
//       JOptionPane.showMessageDialog(null,e.getMessage());
//       }
        public int calculNombreClient(){
        String requete = "SELECT count(*) FROM fos_user WHERE roles= ?  ";
        int nombreClient = 0;
        try {
            PreparedStatement statement = cnx.prepareStatement(requete);
              statement.setString(1, "client");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
               nombreClient=rs.getInt(1);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return nombreClient;
    }
           public int calculNombreResponsable(){
               String  responsable ;             
        String requete = "SELECT count(*) FROM fos_user WHERE roles= ?";
        int nombreClient = 0;
        try {
            PreparedStatement statement = cnx.prepareStatement(requete);
            statement.setString(1, "responsable");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
               nombreClient=rs.getInt(1);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return nombreClient;
    }
    @SuppressWarnings("empty-statement")
       public int verfier()  {
             int cinprof = 0 ;   
    try {
     stm=conn.obtenirconnexion().createStatement();
ResultSet res=stm.executeQuery("SELECT id FROM fos_user");
     // String user = txt_mail.getText();
    //    String pass = txt_password.getPassword();
   // String pass = new String (txt_password.getPassword());
     // String role =(String)typeUser.getSelectedItem();

      while(res.next()) { 
     
             cinprof = res.getInt("id");
             return cinprof ;
 
      }
    } catch(Exception e) {
      JOptionPane.showMessageDialog(null, e);   
    }   return cinprof ;
}
       
       
       
       
       
       public void verfier_autentification( String user1, String pwd) throws SQLException, ClassNotFoundException  {
        //   Personne  u =new Personne();
   // String sql = "SELECT * FROM user ";
            
                
   // try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     //stm=conn.obtenirconnexion().createStatement();
//ResultSet res=stm.executeQuery("SELECT * FROM user");
     // String user = txt_mail.getText();
    //    String pass = txt_password.getPassword();
   // String pass = new String (txt_password.getPassword());
     // String role =(String)typeUser.getSelectedItem();

     // while(res.next()) { 
        
           
       // String pass = res.getString("mot_de_passe").intern();
              PreparedStatement command = cnx.prepareStatement("Select * from fos_User where email=? and password = ?");
            command.setString(1,user1 );
            command.setString(2, pwd);
            ResultSet res = command.executeQuery();
while(res.next()) { 
    String uname = res.getString("email");
         setMail(res.getString("email"));
               setCin1(res.getInt("id"));
              setNomp(res.getString("nom"));
              setPrenomp(res.getString("prenom"));
              //setImgprofil(res.getBlob("profile"));
         
            //   setPwdp(res.getString("mot_de_passe"));
     //  int  id = res.getString("cin");
       
           String role = res.getString("roles");
          nom = res.getString("nom");
             cin = res.getInt("id");
           String pass = res.getString("password");
            if (role.equals("responsable")){ 
                    JOptionPane.showMessageDialog(null,  "vous etes connecté   "+nom);
                Page_responsable f = new Page_responsable();
          f.setVisible(true);}
            else if (role.equals("client")){
                    JOptionPane.showMessageDialog(null,  "vous etes connecté   "+nom);
                  afficher_pack f = new afficher_pack();
          f.setVisible(true);}
            else if (role.equals("admin")){
                     JOptionPane.showMessageDialog(null,  "vous etes connecté   "+nom);
                  AdminGui f = new AdminGui();
          f.setVisible(true);}
            else if(role.equals(null))
                    JOptionPane.showMessageDialog(null,  "vous etes  bloqué  "+nom);
            }
      }
       
      
//}
                
//        if ((user1.equals(uname)) && (pwd.equals(pass)) && (role.equals("responsable"))) { 
//    //    if (u.) {  // ... admin
//         //   dispose();
//          //  aCai aCai = new aCai();
//          //  aCai.setVisible(true);
//          //  aCai.setExtendedState(Frame.MAXIMIZED_BOTH);
//     
//           JOptionPane.showMessageDialog(null,  "vous etes connecté responsable"+nom);
//           AdminGui f = new AdminGui();
//           f.setVisible(true);}
//            else  if ((user1.equals(uname)) && (pwd.equals(pass)) && (role.equals("client"))) { 
//           JOptionPane.showMessageDialog(null,  "vous etes connecté client  "+nom);
//           afficher_pack f = new afficher_pack();
//           f.setVisible(true);}
//                else  if ((user1.equals(uname)) && (pwd.equals(pass)) && (role.equals("bloquer")))  { 
//           JOptionPane.showMessageDialog(null,  "votre compte ne pas encors valider");
//           }
//               else  if ((user1.equals(uname)) && (pwd.equals(pass)) && (role.equals("admin"))) { 
//           JOptionPane.showMessageDialog(null,  "vous etes connecté Mr /Mme   "+nom);
//           AdminGui f = new AdminGui();
//           f.setVisible(true);}
//        
//        else if ((user1.equals(null)) || (pwd.equals(null))) {
//        JOptionPane.showMessageDialog(null,  "écriver le mot de passe et mail ");}
//     //   else{  JOptionPane.showMessageDialog(null,  "attend la validation de votre compte  ");  }
//        
//      }
//    } catch(Exception e) {
//      JOptionPane.showMessageDialog(null, e);   
  // }
       
       
       
        public image findOne(int id) {

        image p = new image();
        String requete = "select * from image where id=" + id;
        try {
            Statement statement = cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
      //      CategorieProduitDao cpd = new CategorieProduitDao();
          //  ClientDao cd = new ClientDao();
            while (resultat.next()) {
                p.setId(resultat.getString(1));
                p.setTitre(resultat.getString(2));
              //  p.setCategorie(cpd.findOne(resultat.getInt(3)));
              //  p.setMarque(resultat.getString(4));
              //  p.setPrix(resultat.getFloat(5));
              //  p.setDate_fin(resultat.getDate(6));
              //  p.setEstValide(resultat.getInt(7));
              //  p.setQuantite(resultat.getInt(8));
               // p.setEstAchetee(resultat.getInt(9));
                p.setImg(resultat.getBlob(3));
               // p.setDescription(resultat.getString(11));
            //    p.setClient(cd.findOne(resultat.getInt(12)));
            }
            return p;
        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex);
            return null;
        }

    }
            
       public fos_user findOne1(int id) {

        fos_user p = new fos_user();
        String requete = "select * from fos_user where cin=" + id;
        try {
            Statement statement = cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
      //      CategorieProduitDao cpd = new CategorieProduitDao();
          //  ClientDao cd = new ClientDao();
            while (resultat.next()) {
                p.setId(resultat.getInt(1));
                p.setNom(resultat.getString(2));
              //  p.setCategorie(cpd.findOne(resultat.getInt(3)));
//              p.setMail(resultat.getString(3));
//                    p.setPrenom(resultat.getString(4));
//                          p.setRole(resultat.getString(5));
//              //  p.setPrix(resultat.getFloat(5));
              //  p.setDate_fin(resultat.getDate(6));
              //  p.setEstValide(resultat.getInt(7));
              //  p.setQuantite(resultat.getInt(8));
               // p.setEstAchetee(resultat.getInt(9));
             //   p.setProfile(resultat.getBlob(3));
               // p.setDescription(resultat.getString(11));
            //    p.setClient(cd.findOne(resultat.getInt(12)));
            }
            return p;
        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex);
            return null;
        }

    }
       
       

public boolean findimg(int id) {

        image p = new image();
        String requete = "select * from image where id=" + id;
        try {
           Statement statement = cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
      //      CategorieProduitDao cpd = new CategorieProduitDao();
          //  ClientDao cd = new ClientDao();
            while (resultat.next()) {
                p.setId(resultat.getString(1));
                p.setTitre(resultat.getString(2));
              //  p.setCategorie(cpd.findOne(resultat.getInt(3)));
              //  p.setMarque(resultat.getString(4));
              //  p.setPrix(resultat.getFloat(5));
              //  p.setDate_fin(resultat.getDate(6));
              //  p.setEstValide(resultat.getInt(7));
              //  p.setQuantite(resultat.getInt(8));
               // p.setEstAchetee(resultat.getInt(9));
                p.setImg(resultat.getBlob(3));
               // p.setDescription(resultat.getString(11));
            //    p.setClient(cd.findOne(resultat.getInt(12)));
            }
            return true;
        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex);
            return false;
        }

    }



       
//        public user findOne1(int id) {
//
//        String requete = "select * from user where cin ="+id;
//        try {
//            Statement statement = cnx.createStatement();
//            ResultSet resultat = statement.executeQuery(requete);
//            user c = new user();
//          //  CategorieServiceDao csd = new CategorieServiceDao();
//            
//            while (resultat.next()) {
//                
//                c.setCin(resultat.getInt(1));
//                c.setNom(resultat.getString(2));
//                c.setPrenom(resultat.getString(3));
//             //   c.setDate_naissance(resultat.getDate(4));
//                c.setMail(resultat.getString(5));
//               // c.setTel(resultat.getInt(6));
//               // c.setLogin(resultat.getString(7));
//                c.setMot_de_passe(resultat.getString(8));
//               // c.setNb_point(resultat.getInt(9));
//               /// c.setCompetence(csd.findOne(resultat.getInt(10)));
//               // c.setBan(resultat.getInt(11));
//
//            }
//            return c;
//        } catch (SQLException ex) {
//            System.out.println("SQL Error: " + ex);
//            return null;
//        }
//    }
           public void ModifierClient(fos_user client)
    {
         try {  
             
            PreparedStatement ps = cnx.prepareStatement("UPDATE `fos_user` SET `nom`=?,`prenom`=?,`mail`=?,`password`=? WHERE `id`=?");
            ps.setString(1, client.getNom());
            ps.setString(2, client.getPrenom());
           // ps.setDate(3, client.getDate_naissance());
            ps.setString(4, client.getEmail());
            //ps.setInt(5, client.getTel());
            //ps.setString(6, client.getLogin());
            ps.setString(7, client.getPassword());
          //  ps.setInt(8, client.getNb_point());
           // ps.setInt(9, client.getCompetence().getId_catS());
           // ps.setInt(10, client.getBan());
            ps.setInt(11, client.getId());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("SQL Error:" + ex);
        }
    }

   public   String a;
    public String nom ( String nom1){
   
    a = nom1;
    return ( nom1);}
    
    public String nomprofile ( ){
    
    
    return ( a);
    
    }
 public boolean veririf_img_profil(int cincompt) throws SQLException {
 
     Rs = stm.executeQuery("Select * From image WHERE id = '"+cincompt+"'");
        return Rs.next();
 
 }
   
    
    
    public void ajouterpacker(image cp) {
  
     
        try {
            try (PreparedStatement st = cnx.prepareStatement("INSERT INTO `image`( `titre`, `img`,`id`) VALUES (?,?,?)")) {
                st.setString(1, cp.getTitre());
                st.setBytes(2,cp.getPhoto_pack());
            //    i=i+1;
                 //  st.setInt(3, cp.getId_pack()));
                     st.setString(3,cp.getId());
                st.executeUpdate();
            }
        } catch (SQLException ex) {
         //   Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//     public void ajouterimgProfile(ImageProfil cp) {
//  
//     
//            try {
//            try (PreparedStatement st = cnx.prepareStatement("INSERT INTO `imageprofil`( `nom_profil`, `Photo_profil`,`Idprofil`) VALUES (?,?,?)")) {
//                st.setString(1, cp.getNom_profil());
//                st.setBytes(2,cp.getPhoto_profil());
//            //    i=i+1;
//                 //  st.setInt(3, cp.getId_pack()));
//                     st.setString(3,cp.getIdprofil());
//                st.executeUpdate();
//            }
//        } catch (SQLException ex) {
//         //   Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
     
     
       
}

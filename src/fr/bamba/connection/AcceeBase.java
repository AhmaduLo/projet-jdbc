package fr.bamba.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




public class AcceeBase {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//*************************connection mysql et java************************************
		 try
		    {
		      
			 // chargement de la classe du pilote JDBC.......................................
		      Class.forName("com.mysql.jdbc.Driver");
		      String url = "jdbc:mysql://localhost:3306/exobase";
		      // bd-exobase est le nom de votre base de données................................................

		      Connection connexion=DriverManager.getConnection(url,"root","");
		      System.out.println ("ça marche ! ");
		      
		      //**********************requete******************************
		      
		      Statement statement = connexion.createStatement();
		      ResultSet resultat= null;
		     resultat = statement.executeQuery("SELECT * FROM inscrit");
		     
		     while(resultat.next()) {
		    	 System.out.println(resultat.getString("prenom") +" "+ resultat.getString("nom") +" "+ resultat.getString("email"));
		     }
		     
		     //*****************************pour le update*************************************************
		     
		     int miseaJour = 0;
		      miseaJour  = statement.executeUpdate("Update inscrit Set nom = 'Lo' where prenom = 'BAMBA' ");
		      
		      //************************************insertion***********************************************************
		    //String insert = "insert into inscrit VALUES (null ,'Dilane','inconnu','1985/05/02','momo@gmail.com')"; 
		     
		    //statement.executeUpdate(insert);
		     
		     //******************************************delet**************************************************************
		      
		     //String delete = "DELETE FROM inscrit WHERE id = 17 ";
		     
		     //statement.executeUpdate(delete);
		      
		     //*************************************create table*************************************************************
		      

		     // String createdTable = " CREATE table lyes (id int , nom char(10) )";
		      
		      
		      //statement.executeUpdate(createdTable);
		      
		      //*************************************drop table**********************************************************
		      
		     // String dropTable = "DROP TABLE IF EXISTS dilane";
		      	
		      //statement.executeUpdate(dropTable);
		    
		      
		      //*******************************inner Join*****************************************************************
		      
            
		      
		      
		      
		      
		      
		      
		    }
		    catch(Exception e)
		    {
		      System.out.println ("Zut, la connexion a échoué");
		      e.printStackTrace ();
		    } 
		 
		
			


	}
	
}

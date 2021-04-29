package hu.nive.ujratervezes.kepesitovizsga.jurrasic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class JurassicPark {

    private DataSource dataSource;

    public JurassicPark(DataSource dataSource){
        this.dataSource= dataSource;
    }

    public List<String> checkOverpopulation(String name){
        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement stmt =
                        connection.prepareStatement("SELECT")

                ) {
        } catch (SQLException sqle) {
          throw new IllegalStateException("error", sqle);
        }
    }

}

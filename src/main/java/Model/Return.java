package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
@Data
@AllArgsConstructor
public class Return {
        @Id
           private int returnID;
           private int itemID;
           private String itemName;
           private String itemQty;
}



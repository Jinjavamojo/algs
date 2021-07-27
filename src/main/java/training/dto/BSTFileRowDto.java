package training.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BSTFileRowDto {

    private String id;
    private String left;
    private String right;
    private Integer value;
}

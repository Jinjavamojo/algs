package training.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
public class BSTFileDto {

    private List<BSTFileRowDto> nodes;
    private String rootNodeValue;
}

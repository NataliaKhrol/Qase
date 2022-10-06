package dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiResponse {
    boolean status;
    Project result;

}

package project.developer_pacemaker.dto.joinRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoinRequestCreateDTO {
    private long sgSeq;
    private long uSeq;
}

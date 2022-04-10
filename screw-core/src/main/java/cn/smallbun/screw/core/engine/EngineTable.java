package cn.smallbun.screw.core.engine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class EngineTable implements Serializable {

    /**
     * 表名
     */
    private String tableName;
    /**
     * 功能模块
     */
    private String businessModel;

    public EngineTable(String tableName, String businessModel) {
        this.tableName = tableName;
        this.businessModel = businessModel;
    }
}

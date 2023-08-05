package cn.tcode.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("sys_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @TableId
    private Long id;
    private String name;
    private Integer age;

}

package plus.guiyun.app.common.code.domain.model;

import jakarta.validation.constraints.NotNull;

/**
 * 用户登录对象
 *
 * @author guiyun
 */
public class LoginBody {

    /**
     * 用户名
     */
    @NotNull(message = "用户名不能为空")
    private String account;


    /**
     * 用户密码
     */
    @NotNull(message = "密码不能为空")
    private String password;

    /**
     * 验证码
     */
    private String code;

    /**
     * 唯一标识
     */
    private String uuid;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}

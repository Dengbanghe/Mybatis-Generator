package com.data.model;

public class UserEntity {
    /**
     * <pre>
     * 主键
     * 表字段 : user.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 父id
     * 表字段 : user.pid
     * </pre>
     */
    private Integer pid;

    /**
     * <pre>
     * 状态
     * 表字段 : user.state
     * </pre>
     */
    private String state;

    /**
     * <pre>
     * 内容
     * 表字段 : user.content
     * </pre>
     */
    private String content;

    /**
     * <pre>
     * 获取：主键
     * 表字段：user.id
     * </pre>
     *
     * @return user.id：主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：主键
     * 表字段：user.id
     * </pre>
     *
     * @param id
     *            user.id：主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：父id
     * 表字段：user.pid
     * </pre>
     *
     * @return user.pid：父id
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * <pre>
     * 设置：父id
     * 表字段：user.pid
     * </pre>
     *
     * @param pid
     *            user.pid：父id
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * <pre>
     * 获取：状态
     * 表字段：user.state
     * </pre>
     *
     * @return user.state：状态
     */
    public String getState() {
        return state;
    }

    /**
     * <pre>
     * 设置：状态
     * 表字段：user.state
     * </pre>
     *
     * @param state
     *            user.state：状态
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * <pre>
     * 获取：内容
     * 表字段：user.content
     * </pre>
     *
     * @return user.content：内容
     */
    public String getContent() {
        return content;
    }

    /**
     * <pre>
     * 设置：内容
     * 表字段：user.content
     * </pre>
     *
     * @param content
     *            user.content：内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
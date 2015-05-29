package com.bbh.shiro.core.context;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.hyxt.data.rbac.vo.RoleVo;
import com.hyxt.data.rbac.vo.ShopVo;
import com.hyxt.data.rbac.vo.StoreVo;
import com.hyxt.data.rbac.vo.UserVo;

import java.io.Serializable;
import java.util.List;

public class SessionVariable
        implements IUserSessionVariable, Serializable {
    private UserVo user;

    public UserVo getUser() {
        return this.user;
    }

    public void setUser(UserVo user) {
        this.user = user;
    }

    public String getUserId() {
        return this.user.getId();
    }

    public String getShopId() {
        return this.user.getShop().getId();
    }

    public List<String> getStoreIds() {
        return Lists.transform(this.user.getStores(), new Function() {
            public String apply(StoreVo input) {
                return input.getId();
            }
        });
    }

    public List<String> getRoleIds() {
        return Lists.transform(this.user.getRoles(), new Function(String,RoleVo) {
            public String apply(RoleVo input) {
                return input.getId();
            }
        });
    }

    public List<String> getRoleNames() {
        return Lists.transform(this.user.getRoles(), new Function() {
            public String apply(RoleVo input) {
                return input.getName();
            }
        });
    }
}

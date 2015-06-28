package com.bbh.shop.povider.test;

import com.bbh.shop.api.entity.Admin;
import com.bbh.shop.api.service.AdminService;
import com.bbh.shop.provider.service.AdminServiceImpl;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by test on 2015/6/25.
 */
public class AdminServiceImplTest extends BaseTest {
    @Autowired
    private AdminService adminService;

    @Test
    public void testSearch() {
        Admin admin = adminService.findByUsername("admin");
        Assert.assertEquals("admin", admin.getUsername());
    }

    @Test
    public void testSave() {
        Admin admin = new Admin();
        admin.setUsername("aaaa"+RandomUtils.nextLong(1l,10000l));
        admin.setIsLocked(false);
        admin.setCreateDate(new Date());
        admin.setDepartment("xxxxx");
        admin.setEmail("xx@cc.com");
        admin.setIsEnabled(true);
        admin.setName("aaaa");
        admin.setPassword("111111");
        admin.setLoginFailureCount(0);
        int count=adminService.save(admin);
        Assert.assertTrue(count > 0);
    }

    @Test
    public void testDelete() {
        Admin admin = new Admin();
        admin.setId(2l);
        int count=adminService.delete(admin);
        assertTrue(count>0);
    }

}

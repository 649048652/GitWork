package com.test.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.test.DAOTest.EMPDAO;
import com.test.USER.EMP;

public class EmpDAO {
	private EMPDAO EmpDao;

	@Before
	public void befores() {
		EmpDao = new EMPDAO();
	}

	@Test
	public void SelectId() {
		EMP emp = EmpDao.selectByPrimaryKey(7934);
		System.out.println(emp);
	}
	
	@Test
	public void SelectAll() {
		List<EMP> emps = EmpDao.selectAll();
		for (EMP emp : emps) {
			System.out.println(emp);
		}
	}

	@Test
	public void updateId() {
		EMP emp = new EMP();
		emp.setEmpno(7934);
		emp.setEname("中文");
		emp.setJob("母鸡");
		emp.setMgr(123);
		emp.setHiredate(new Date());
		emp.setSal(new BigDecimal(123));

		int t = EmpDao.updateByPrimaryKeySelective(emp);

		System.out.println();
		System.out.println(emp);
		System.out.println("修改成功：" + t + "行");
	}

	@Test
	public void insert() {
		EMP emp = new EMP();
		emp.setEname("中文");
		emp.setJob("母鸡");
		emp.setMgr(123);
		emp.setHiredate(new Date());
		emp.setSal(new BigDecimal(123));
		emp.setDeptno(10);

		int t = EmpDao.insertSelective(emp);

		System.out.println();
		System.out.println(emp);
		System.out.println("添加成功：" + t + "行");
	}

	@Test
	public void delete() {
		int id = 7935;
		int t = EmpDao.deleteByPrimaryKey(id);

		System.out.println("删除成功：" + t + "行");
	}

}

package com.test.DAOTest;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.test.USER.EMP;

public class EMPDAO implements EMPMapper {

	private SqlSession session;
	private SqlSessionFactory factory;

	public EMPDAO() {
		String resource = "MybatisConfig.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Override
	public int deleteByPrimaryKey(Integer empno) {
		session = factory.openSession();
		int t = session.delete("EMP.deleteByPrimaryKey",empno);
		session.commit();
		session.close();
		return t;
	}

	@Override
	public int insertSelective(EMP record) {
		session = factory.openSession();
		int t = session.insert("EMP.insertSelective",record);
		session.commit();
		session.close();
		return t;
	}

	@Override
	public EMP selectByPrimaryKey(Integer empno) {
		session = factory.openSession();
		EMP emp = session.selectOne("EMP.selectByPrimaryKey",empno);
		session.close();
		return emp;
	}

	@Override
	public int updateByPrimaryKeySelective(EMP record) {
		session = factory.openSession();
		int t = session.update("EMP.updateByPrimaryKeySelective",record);
		session.commit();
		session.close();
		return t;
	}
	
	public List<EMP> selectAll() {
		session = factory.openSession();
		List<EMP> emps = session.selectList("EMP.selectAll");
		session.close();
		return emps;
	}

}

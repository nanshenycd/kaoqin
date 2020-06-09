package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.nanshenycd.kaoqin.pojo.Attence;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.nanshenycd.kaoqin.pojo.Attence;

public class TestMybatis {

    public static void main(String[] args) throws IOException {
        String resource = "application.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        listAll(session);

        session.commit();
        session.close();

    }

    private static void listAll(SqlSession session) {
        List<Attence> cs = session.selectList("list");
        for (Attence c : cs) {
            System.out.println(c.getEmpname());
        }
    }
}
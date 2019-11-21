import com.qmy.po.EmpEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Test {
    @org.junit.Test
    public void test(){
        //1获取sessionFactory 会话工厂
        SessionFactory sessionFactory =
                new Configuration().configure().buildSessionFactory();
        //2.生产会话 通过opensession 获取session对象
        Session session = sessionFactory.openSession();
        //3.开启一个事务
        Transaction transaction = session.beginTransaction();
        //执行查询 get（查询的实体类型，参数）I
        EmpEntity emp = session.get(EmpEntity.class,1);
        System.out.println("Emp =" + emp);
    }
}



package hibernate.reverseengineering;

import java.util.List;
import org.hibernate.cfg.reveng.DelegatingReverseEngineeringStrategy;
import org.hibernate.cfg.reveng.ReverseEngineeringStrategy;
import org.hibernate.cfg.reveng.TableIdentifier;
import org.hibernate.mapping.Column;

/**
 *
 * @author Merve Sahin
 */
public class HibernateReverseEngineeringStrategy extends DelegatingReverseEngineeringStrategy {

    public HibernateReverseEngineeringStrategy(ReverseEngineeringStrategy delegate) {
        super(delegate);
    }

    @Override
    public String tableToClassName(TableIdentifier tableIdentifier) {
        return super.tableToClassName(tableIdentifier) + "Entity";
    }

    @Override
    public boolean excludeForeignKeyAsCollection(String keyname, TableIdentifier fromTable, List<Column> fromColumns, TableIdentifier referencedTable, List<Column> referencedColumns) {
        super.excludeForeignKeyAsCollection(keyname, fromTable, fromColumns, referencedTable, referencedColumns);
        return true;
    }
}

package med.voll.api.medico;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.endereco.Endereco;
import med.voll.api.medico.dto.DadosCadastroMedico;
import med.voll.api.medico.dto.Especialidade;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;


@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "medicos")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Medico medico = (Medico) o;
        return getId() != null && Objects.equals(getId(), medico.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}



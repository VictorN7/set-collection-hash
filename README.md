# 🧩 Coleções de Hash em Java — Set

### ❓ O que são:

As implementações de `Set` representam uma coleção que:
- Não permite elementos duplicados
- Não possui acesso por índice

Principais implementações:
- `HashSet`
- `LinkedHashSet`
- `TreeSet`

---

### 💭 Para que servem:

São usadas quando você precisa armazenar **valores únicos**, com diferentes características de:
- desempenho
- ordenação
- previsibilidade da iteração

---

### 🙋‍♂️ HashSet

- Não garante ordem
- Mais rápido na maioria dos casos
- Baseado em hash

```java
Set<String> set = new HashSet<>();
```

### 🙋‍♂️ LinkedHashSet

- Mantém a ordem de inserção
- Desempenho intermediário
- Baseado em hash + lista ligada

```java
Set<String> set = new LinkedHashSet<>();
```

### 🙋‍♂️ TreeSet

- Mantém os elementos ordenados
- Usa a ordem natural (Comparable) ou Comparator
- Mais lento que as outras implementações

```java
Set<String> set = new TreeSet<>();
```

### 🔄 Operações comuns entre conjuntos

```java
addAll()     // União
retainAll()  // Interseção
removeAll()  // Diferença
```

### 📌 Resumo

| Implementação | Ordenação         | Desempenho | Observação        |
| ------------- | ----------------- | ---------- | ----------------- |
| HashSet       | ❌ Nenhuma         | 🚀 Alto    | Mais rápido       |
| LinkedHashSet | Ordem de inserção | ⚖️ Médio   | Previsível        |
| TreeSet       | Ordem natural     | 🐢 Baixo   | Requer comparação |

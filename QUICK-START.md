# 🧪 Guide Rapide - Projet de Test SBT

## 📦 Ce Que Tu As

Un **projet SBT complet** pour tester ton action `setup-sbt` !

## 📁 Contenu du Projet

```
sbt-test-project/
├── build.sbt                      # Configuration SBT avec dépendances
├── project/build.properties       # SBT 1.10.4
├── src/
│   ├── main/scala/com/example/
│   │   ├── Calculator.scala      # Classe avec logging
│   │   ├── JsonUtils.scala       # Serialization JSON (Circe)
│   │   └── Main.scala            # Point d'entrée
│   ├── main/resources/
│   │   └── logback.xml           # Config logging
│   └── test/scala/com/example/
│       ├── CalculatorSpec.scala  # 6 tests
│       └── JsonUtilsSpec.scala   # 5 tests
└── .github/workflows/
    └── ci.yml                     # Utilise ton action setup-sbt !
```

## 🚀 Publier sur GitHub

### **Étape 1 : Extraire le Projet**

```bash
# Sur ton laptop
cd ~/projets/sbt
tar -xzf sbt-test-project.tar.gz
cd sbt-test-project
```

### **Étape 2 : Tester Localement (Optionnel)**

```bash
# Nécessite SBT installé localement
sbt compile   # Compiler
sbt test      # Lancer les tests (11 tests)
sbt run       # Exécuter l'application
```

### **Étape 3 : Initialiser Git**

```bash
git init
git add .
git commit -m "Initial commit - SBT test project for validating setup-sbt action

- Calculator with logging
- JSON utilities with Circe
- 11 unit tests with ScalaTest
- CI workflow using setup-sbt action
- Tests multiple Scala and Java versions"
```

### **Étape 4 : Créer le Repo sur GitHub**

**Via l'interface web :**
1. Va sur https://github.com/new
2. Repository name: `sbt-test-project`
3. Description: `Test project for validating sbt-actions`
4. Public
5. Create repository

**Ou via CLI :**
```bash
gh repo create sbt-test-project --public --source=. --remote=origin
```

### **Étape 5 : Pousser le Code**

```bash
git remote add origin https://github.com/tina-alliche/sbt-test-project.git
git branch -M main
git push -u origin main
```

---

## 🧪 Que Va Tester le Workflow ?

Le workflow `.github/workflows/ci.yml` va **automatiquement** :

### **Job 1 : Build and Test**
1. ✅ Utiliser ton action `setup-sbt`
2. ✅ Compiler le projet
3. ✅ Lancer les 11 tests
4. ✅ Exécuter l'application

### **Job 2 : Test Multiple Scala Versions**
- ✅ Scala 3.3.1
- ✅ Scala 3.3.0
- ✅ Scala 3.2.2

### **Job 3 : Test Multiple Java Versions**
- ✅ Java 17
- ✅ Java 21

---

## 📊 Résultats Attendus

Une fois poussé, va sur :
```
https://github.com/tina-alliche/sbt-test-project/actions
```

Tu devrais voir :
- 🟡 Workflow "CI" qui démarre
- ⏱️ Environ 3-5 minutes de build
- ✅ 3 jobs qui passent au vert
- 🎉 Ton action fonctionne !

---

## 🔍 Détails des Tests

### **CalculatorSpec (6 tests)**
```
✓ should add two numbers correctly
✓ should subtract two numbers correctly
✓ should multiply two numbers correctly
✓ should divide two numbers correctly
✓ should return error when dividing by zero
✓ should calculate power correctly
```

### **JsonUtilsSpec (5 tests)**
```
✓ should serialize User to JSON
✓ should deserialize JSON to User
✓ should handle invalid JSON
✓ should pretty print JSON
✓ should round-trip User through JSON
```

---

## 🎯 Utilisation du Projet

### **Tester une Modification de ton Action**

1. Modifie ton action `setup-sbt`
2. Push sur `sbt-actions`
3. Le workflow dans `sbt-test-project` se déclenche automatiquement
4. Vérifie que tout passe

### **Ajouter de Nouveaux Tests**

Voir `CONTRIBUTING.md` pour :
- Ajouter des dépendances
- Créer de nouvelles classes
- Écrire plus de tests

---

## 💡 Avantages de Ce Projet

✅ **Réaliste** - Vraies dépendances (Circe, ScalaTest, Logback)  
✅ **Complet** - Structure standard SBT  
✅ **Testé** - 11 tests qui passent  
✅ **CI/CD** - Workflow complet avec ton action  
✅ **Multi-versions** - Teste Scala 3.x et Java 17/21  
✅ **Documentation** - README, CONTRIBUTING  

---

## 🚨 Important

**Le workflow référence ton action :**
```yaml
uses: tina-alliche/sbt-actions/.github/actions/setup-sbt@main
```

Donc :
- ✅ Publie d'abord `sbt-actions` (déjà fait ✅)
- ✅ Puis publie `sbt-test-project`
- ✅ Le workflow utilisera automatiquement ton action !

---

## 📋 Checklist

- [ ] Extraire `sbt-test-project.tar.gz`
- [ ] Tester localement (optionnel)
- [ ] Initialiser Git
- [ ] Créer repo GitHub
- [ ] Pousser le code
- [ ] Vérifier que le workflow démarre
- [ ] Tous les jobs passent ✅
- [ ] Ton action est validée ! 🎉

---

**Prêt à publier ? Extrais le projet et on y va ! 🚀**

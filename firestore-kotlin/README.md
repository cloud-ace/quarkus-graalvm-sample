# Quarkus-FireStore Sample by Kotlin

FireStoreに接続するKotlinで書かれたQuarkusアプリケーションのサンプルです。

# ローカル実行

```
./gradlew quarkusDev
```

# ネイティブイメージの作成

```
./gradlew firestore-kotlin:build -Dquarkus.package.type=native -Dquarkus.native.container-build=true
```

# Dockerイメージの作成

```
docker build -t gcr.io/${project_name}/firestore-kotlin -f firestore-kotlin/src/main/docker/Dockerfile.native .
```

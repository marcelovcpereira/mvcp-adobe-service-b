# Marcelo Adobe Test: Mock Service B


```bash
git clone https://github.com/marcelovcpereira/mvcp-adobe-service-b.git
cd mvcp-adobe-service-b/src/main/resources/devops
helm template --name marcelo-adobe-service-b --namespace marcelo-test -f values.yaml .
helm install --name marcelo-adobe-service-b --namespace marcelo-test -f values.yaml .

helm install --name marcelo-adobe-service-b2 --namespace marcelo-test -f values2.yaml .
helm install --name marcelo-adobe-service-b3 --namespace marcelo-test -f values3.yaml .
```
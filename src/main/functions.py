# external python libs

# internal python libs
import json
import uuid


def generateId(event, context):

    id = uuid.uuid4()

    body = {
        "runtime": "python",
        "id": str(id)
    }

    response = {
        "statusCode": 200,
        "body": json.dumps(body),
    }

    return response

if __name__ == "__main__":
    generateId("{}", "{}")
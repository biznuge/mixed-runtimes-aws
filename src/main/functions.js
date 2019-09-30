const uuid = require('uuid');

module.exports.generateId = async (event, context, callback) => {

  let data = {
    runtime: "node",
    id: uuid.v4()
  }

  const response = {
    statusCode: 200,
    body: JSON.stringify(data),
  };

  callback(null, response);

};
